package Week4.Composition_Aggregation;

import java.util.Date;

interface QIF{
    int getStatus(int trainNo, Date d);
}

class TrainBooking{
    public QIF login(String username,String pass){
        QueryObject Q_obj;
        if(valid_login(username, pass)){
            Q_obj = new QueryObject();
            return  Q_obj;
        }
        else return null;
    }

    private boolean valid_login(String uname,String pass){
        // implement this method
        return true;
    }

    private class QueryObject implements QIF{
        int numQrs;
        // even when not initialized to 0 it will still hold zero
        private static final int Qlimit = 3;

        @Override
        public int getStatus(int tno,Date date){
//            System.out.println(numQrs);
            if(numQrs<Qlimit){
                numQrs++;
                return 1;
            }
            else {
                System.out.println("Query Limit Reached");
                return 0;
            }

        }
    }
}

public class CITO {
    static void main(String[] args) {
        TrainBooking tb = new TrainBooking();
        // we can not even cast QIF into QueryObject
        QIF q = tb.login("username","pass123");

        System.out.println(q.getStatus(1234,new Date(1)));
        System.out.println(q.getStatus(1234,new Date(1)));
        System.out.println(q.getStatus(1234,new Date(1)));
        System.out.println(q.getStatus(1234,new Date(1)));
        System.out.println(q.getStatus(1234,new Date(1)));
        System.out.println(q.getStatus(1234,new Date(1)));

    }

}
