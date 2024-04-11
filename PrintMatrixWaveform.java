//Pseudo code
int row=n;
int col=m;
int[][] arr=new int[row][col];
for(int i =0;i<row;i++){
  if(i%2==0){
    for(int j =0;j<col;j++){
      System.out.print(arr[i][j]+" ");
    }
  }else{   
      for(int j =col-1;j>=0;j--){
        System.out.print(arr[i][j]+" ");
      }    
  }
  System.out.println();
  System.out.println();
}
