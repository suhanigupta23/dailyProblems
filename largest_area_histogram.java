//kitna bada ek histogram area bana sakta hei 
public class largest_area_histogram {
    //ek histogram ka area utna fel sakta hei (utni width tak) jaha tak uske next eleemnt that is next greatrst element to the right na mil jaye aur next greater integer on the right . vo uski boundary length hogi ..

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(new InputStreamReader(System.in)));

        int n=Integer.parseInt(br.readLine());
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        int [] rb=new int[a.length]; //nse index on the right 
        //right bound
        Stack<Integer> st=new Stack<>();
        st.push(a.length-1);
        rb[a.length-1]=a.length;

        for(int i=a.length-2;i>=0;i--)
        {
            while(st.size()>0 && a[i]<a[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                rb[i]=a.length;
            }
            else{
                rb[i]=st.peek();
            }
            st.push(i);
        }
        int [] lb=new int[a.length]; //nse index on the left
        //left bound

        st=new Stack<>();
        st.push(0);
        lb[0]=-1;

        for(int i=1;i<a.length;i++)
        {
            while(st.size()>0 && a[i]<a[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                lb[i]=-1;
            }
            else{
                lb[i]=st.peek();
            }
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<n;i++)
        {
            int width=rb[i]-lb[i]-1;
            int area=a[i]*width;
            if(area>maxArea){
                maxArea=area;
            }
        }
        System.out.println(maxArea);
    }
}
