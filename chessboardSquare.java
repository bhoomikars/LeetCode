public class chessboardSquare
{
    public static void main (String[] args)
    {
        System.out.println(squareIsWhite("a1"));
    }
    public static boolean squareIsWhite(String coordinates) {
        boolean res = false;
        if(coordinates.charAt(0)=='a' || coordinates.charAt(0)== 'c' || coordinates.charAt(0)=='e' || coordinates.charAt(0)== 'g')
        {
            if(coordinates.charAt(1)%2 == 0)
            res  = true;
            else
            res = false;
        }
        if(coordinates.charAt(0)=='b' || coordinates.charAt(0)== 'd' || coordinates.charAt(0)=='f' || coordinates.charAt(0)== 'h')
        {
            if(coordinates.charAt(1)%2 != 0)
                res = true;
            else
                res = false;
        }
        return  res;

    }
}
