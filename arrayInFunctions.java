public class arrayInFunctions {

    public static void main(String[] args) {
        int marks[]={92,94,62};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
    public static void update(int mark[]){
        for(int i=0;i<mark.length;i++){
            mark[i]+=1;
        }
    }
}