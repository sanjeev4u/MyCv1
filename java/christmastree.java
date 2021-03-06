public class christmastree {
  public static final int SEGMENTS = 4;
  public static final int HEIGHT = 4;
  public static void main(String[] args){
  makeTree();
  }
  // makeTree: code that prints the tree; params: num. of segments of tree, height of tree segments
  public static void makeTree(){
  // maxStars: calculation the length of each line which is the sum of spaces and stars for any line
    int maxStars = 2*HEIGHT+2*SEGMENTS-3;
    // maxStr: master variable string that will be changed and printed for each line
    String maxStr = "";
    // populates maxStr will spaces; will be used with substring to generate needed spaces
    for (int len=0; len < maxStars; len++){
      maxStr+=" ";
    }
    // loops once per segment
    for (int i=1; i <= SEGMENTS; i++){
      // starStr: variable string that changes perline that holds the stars

      // populates starStr with stars
      // loops through each line
      for (int line=1; line <= HEIGHT; line++){
        String starStr = "";
        for (int j=1; j <= 2*line+2*i-3; j++){
          starStr+="*";
        }
        for (int space=0; space <= maxStars-(HEIGHT+line+i); space++){
          starStr = " " + starStr;
        }
        System.out.println(starStr);
      }
    }

    for (int i=0; i <= maxStars/2;i++){
      System.out.print(" ");
    }
    System.out.print("*\n");
    for (int i=0; i <= maxStars/2;i++){
      System.out.print(" ");
    }
    System.out.print("*\n");
    for (int i=0; i <= maxStars/2-3;i++){
      System.out.print(" ");
    }
    System.out.print("*******\n");
  }
}