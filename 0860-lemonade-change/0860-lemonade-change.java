class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveRupee = 0 ;
        int tenRupee = 0 ;
for(int i = 0 ; i < bills.length ; i++){
    if(bills[i] == 5){
        fiveRupee++;
    }
    else if(bills[i] == 10){
        if(fiveRupee > 0){
        fiveRupee--;
        tenRupee++;
        }
        else 
        return false;
    }
    else{
        if(fiveRupee > 0 && tenRupee > 0){
            fiveRupee--;
            tenRupee--;
        }
        else if(fiveRupee >= 3){
            fiveRupee-= 3 ;
        }
        else {
            return false;
        }
    }
}
return true;
    }
}