public class gasStation {

    public static int tank(int[] gas , int[] cost){
        int tTank =0, cTank =0, sStation = 0;

        for(int i =0; i<gas[i]; i++){
            tTank += gas[i] - cost[i];
            cTank += gas[i] - cost[i];

            if(cTank < 0){
                sStation = i + 1;
                cTank = 0;
            }
        }
        if(tTank >= 0) return sStation;
        else return -1;
    }
    public static void main(String[] args){
        int[] gas = {2,3,4};
        int[] cost = {1,2,3};
        System.out.println(tank(gas,cost));
    }
}
