public class FlowControlStatements16{
    public static void main(String args[]){
        if (args.length!=0){
        int n = Integer.parseInt(args[0]);

        for (int c = 1; c <= n; c++)
        {
            for (int d = 1; d <= c; d++)
            {
                System.out.print("*"+" ");

            }

            System.out.println();
        }}
        else{
            System.out.println("Please enter an integer number");
        }
    }
}