//Solution Vid:
//https://youtu.be/1Qe1N2pw8gw 
//Java Code:
class Solution {
public boolean validateStackSequences(int[] pushed, int[] popped) {
Stack<Integer> st = new Stack<>();


int i=0;
int j=0;


while(i<pushed.length && j<popped.length){
if(st.size()==0){
st.push(pushed[i]);
i++;
continue;
}


if(popped[j] == st.peek()){
st.pop();
j++;
}else{
st.push(pushed[i]);
i++;
}
}


while(j < popped.length && popped[j] == st.peek()){
st.pop();
j++;
}


if(st.size()>0){
return false;
}else{
return true;
}
}
}
