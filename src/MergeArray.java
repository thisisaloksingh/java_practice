import java.util.List;

public class MergeArray {

	public void mergeList(List<Integer> a1,List<Integer> a2,int m, int n,List<Integer> a3){
		int i;
		int k=0;
		int j;
		 for(i=0;i<m;i++){
			for(i=0;i<n;i++){
				while(i<m && j<n){
					if(a1[i]<= a2[j]){ //3<
							a3[k++]=a1[i++];//a3[0]=1 //a3[1]=2 //
					}else{
							a3[k++]=a2[j++];//122
					}
				}
				while(i<m){a3[k++]=a1[i++];}
				while(j<n){a3[k++]=a1[j++];}
			}
		}
}
}