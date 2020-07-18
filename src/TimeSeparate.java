import java.util.*;

public class TimeSeparate {

    static class P {
        int arrive;
        int departure;

        public int getArrive() {
            return arrive;
        }

        public void setArrive(int arrive) {
            this.arrive = arrive;
        }

        public int getDeparture() {
            return departure;
        }

        public void setDeparture(int departure) {
            this.departure = departure;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        while ((n--) > 0) {
            int len = Integer.parseInt(scanner.nextLine().trim());
            String[] params = scanner.nextLine().split("\\s+");
            List<P> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                P p = new P();
                p.setArrive(Integer.parseInt(params[i]));
                list.add(p);
            }
            params = scanner.nextLine().split("\\s+");
            for (int i = 0; i < len; i++) {
                list.get(i).setDeparture(Integer.parseInt(params[i]));
            }

            Comparator<P> bya = Comparator.comparing(P::getArrive);
            Comparator<P> byp = Comparator.comparing(P::getDeparture);
//            list.sort(Comparator.comparing(P::getArrive));
            Collections.sort(list, bya.thenComparing(byp));

            List<Integer> ans = new ArrayList<>();
            for (P p : list) {
                if (ans.isEmpty()) {
                    ans.add(p.getDeparture());
                } else {
                    boolean flag = false;
                    for (int i = 0; i < ans.size(); i++) {
                        if (ans.get(i) <= p.getArrive()) {
                            ans.set(i, p.getDeparture());
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        ans.add(p.getDeparture());
                    }
                }
            }
        }
    }
}