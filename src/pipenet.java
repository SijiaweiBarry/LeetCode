import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair {

    int x, y, d;
    Pair(int x, int y, int d) {

        this.x=x;
        this.y=y;
        this.d=d;
    }
}

class myComp implements Comparator<Pair> {

    public int compare(Pair p1, Pair p2) {

        return (p1.d-p2.d);
    }
}

public class pipenet {

    static boolean isVal(int x, int y, int n) {

        return ((x>=0) && (y>=0) && (x<n) && (y<n));
    }

    static void mcp(int[][] a, int n) {

        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};

        int[][] d=new int[n][n];
        for(int i=0; i<n; i++)
            Arrays.fill(d[i], Integer.MAX_VALUE);
        d[0][0]=a[0][0];

        PriorityQueue<Pair> pq=new PriorityQueue<>(10, new myComp());
        pq.add(new Pair(0, 0, a[0][0]));
        boolean[][] vis=new boolean[n][n];

        while(!pq.isEmpty()) {

            Pair p=pq.poll();
            vis[p.x][p.y]=true;

            if((p.x==(n-1)) && (p.y==(n-1)))
                break;

            for(int i=0; i<4; i++) {

                int newx=p.x+dx[i];
                int newy=p.y+dy[i];

                if(!isVal(newx, newy, n))
                    continue;

                if(!vis[newx][newy]) {

                    if(d[newx][newy]>(d[p.x][p.y]+a[newx][newy]))
                        d[newx][newy]=d[p.x][p.y]+a[newx][newy];
                    pq.add(new Pair(newx, newy, d[newx][newy]));
                    vis[newx][newy]=true;
                }
            }
        }

        System.out.println(d[n-1][n-1]);
    }

    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0) {

            int n=sc.nextInt();

            int[][] a=new int[n][n];
            for(int i=0; i<n; i++) {

                for(int j=0; j<n; j++)
                    a[i][j]=sc.nextInt();
            }

            mcp(a, n);

            t--;
        }
    }
}