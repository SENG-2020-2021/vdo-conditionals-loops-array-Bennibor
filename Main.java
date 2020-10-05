class Main {
  public static void main(String[] args) {

        // kindly use appropriate data types for your declaration

        //declare an array variable and assign the days of the month debtor defaulted,
        byte daysOfTheMonthDefaulted [] = { 1,2,3,4,5,6,7};

        // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
        float AmountDebtorPayPerDay = 300f;
        float amountPaid = 1400f;

        // declare all the variables needed for your calculations
        float totalAmountToPay = 0f;
        byte actualElement = 0;
        float temp =amountPaid;
        byte daysDebtorPaid=0;
        float leftToPay;
        float extra;

        // calculate and print total amount the debtor is to pay using for each loop
        for(byte i: daysOfTheMonthDefaulted) {
            totalAmountToPay += AmountDebtorPayPerDay;
            actualElement++;
        }
        System.out.println("The number of the elements in the array is " + actualElement);

        System.out.println("The total amount the debtor is to pay is #" + totalAmountToPay);

        // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day.
        for(int i=0; i<actualElement; i++) {

            if(temp>=AmountDebtorPayPerDay){
                temp = temp - AmountDebtorPayPerDay;
                daysDebtorPaid++;

            }
            else if(temp<AmountDebtorPayPerDay){
                break;
            }
        }

        for(int i=0; i<daysDebtorPaid;i++){
            System.out.println("The debtor paid for day " + daysOfTheMonthDefaulted[i]);
        }

        if(amountPaid%AmountDebtorPayPerDay>0 && amountPaid<totalAmountToPay){
            System.out.println("The day that was not completely paid for is day " + daysOfTheMonthDefaulted[daysDebtorPaid]);

            System.out.println("The amount left to complete the payment for day " + daysOfTheMonthDefaulted[daysDebtorPaid] +" is #" + (AmountDebtorPayPerDay - (amountPaid%AmountDebtorPayPerDay)));
        }
        // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
        if(amountPaid<totalAmountToPay) {
            leftToPay= totalAmountToPay-amountPaid;
            System.out.println("The amount left to pay is #" + leftToPay);
        }
        else if(amountPaid>totalAmountToPay){
            extra = amountPaid-totalAmountToPay;
            System.out.println("The amount you are owed is #" + extra);
        }
        else if(amountPaid == totalAmountToPay) {
            System.out.println("You have paid the amount!");
        }


    }
}