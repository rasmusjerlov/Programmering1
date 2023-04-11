public class opgave6x11 {
    public static void main(String[] args) {
        System.out.println(computeCommission(1));
    }

    public static double computeCommission (double salesAmount) {
        double commission;
        double commissionAmount;
        for (int i = 1000; i <= 20000; i += 1000) {
            if (i >= 1000 && i <= 5000) {
                commission = 0.08;
                commissionAmount = i * commission;
                salesAmount = i * (1 + commission);
//                System.out.println(i + " = " + salesAmount);
                System.out.println("The commision of a sale amount worth " + i + " USD equals to: " + commissionAmount + " USD.");
            } else if (i > 5000 && i <= 10000) {
                commission = 0.10;
                commissionAmount = i * commission;
                salesAmount = i * (1 + commission);
//                System.out.println(i + " = " + salesAmount);
                System.out.println("The commision of a sale amount worth " + i + " USD equals to: " + commissionAmount + " USD.");
            } else {
                commission = 0.12;
                commissionAmount = i * commission;
                salesAmount = i * (1 + commission);
//                System.out.println(i + " = " + salesAmount);
                System.out.println("The commision of a sale amount worth " + i + " USD equals to: " + commissionAmount + " USD.");
            }
        }
        return salesAmount;
    }
}

