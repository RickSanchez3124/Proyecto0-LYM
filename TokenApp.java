import java.util.StringTokenizer;

public class TokenApp {

    public static void main(String[] args) {
	    String entrada="PROG\r\n"
	    		+ "var n , x , y ;\r\n"
	    		+ "PROC putCB (c , b )\r\n"
	    		+ "{\r\n"
	    		+ "drop( c ) ;\r\n"
	    		+ "free ( b ) ;\r\n"
	    		+ "walk( n )\r\n"
	    		+ "}\r\n"
	    		+ "PROC goNorth ()\r\n"
	    		+ "{\r\n"
	    		+ "while ( canWalk ( north ,1) ) do { walk( north ,1) } od\r\n"
	    		+ "}\r\n"
	    		+ "PROC goWest ()\r\n"
	    		+ "{\r\n"
	    		+ "if ( canWalk ( west ,1) ) { walk( west ,1) } fi\r\n"
	    		+ "}\r\n"
	    		+ "{\r\n"
	    		+ "go (3 ,3) ;\r\n"
	    		+ "n =6;\r\n"
	    		+ "putCB (2 ,1)\r\n"
	    		+ "}\r\n"
	    		+ "GORP";
	    String[] listaTok = new String[] {"PROG","var",",","x"};
	    String entrada4 = "PROG";
	    String entrada2 = entrada.replaceAll("\\s","");
	    String entrada3 = entrada2.replace("", " ");
	    System.out.println(entrada2);
	    StringTokenizer tokens=new StringTokenizer(entrada," ");
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }
        
      
    }


    
}