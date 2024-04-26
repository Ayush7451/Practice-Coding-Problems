class countSubString{
    public static void main(String args []){
        String str="abcaabaccbaaabccab";
        String substring="ab";
        int i,j;
        int count = 0;
        i=0;
        while(i<str.length())
        {
            int f=0;
            for(j=0;j<substring.length();j++)
            {
                if(substring.charAt(j)==str.charAt(i))
                {
                    f++;
                    i++;
                }
                    else{i++; break; }
            }    
                if(f==2)
                {
                    count++;
                }
                if(f==1){i=i-1;}
         }
         System.out.println("Count of ab : " +count);

    }

}