package AssignmentNov18;

//		Input: s = "()[]{}"
//		Output: true
//		
//		Input: s = "([)]"
//		Output: false

import java.util.Stack;

public class CheckBalanceParanthesis {
	
	 public boolean isValid(String s) {
		    Stack st = new Stack();
		    int size =s.length();
		    for(int i=0;i<size;i++) {
		        if(i==0) {
		            st.push(s.charAt(i));
		        }
		        else {
		            if(st.size()!=0 &&s.charAt(i)==')'&&(char) st.peek()=='(') {
		                st.pop();                    
		            }
		            else if(st.size()!=0 &&s.charAt(i)==']'&& (char)st.peek()=='['){
		                st.pop();
		            }
		            else if(st.size()!=0 && s.charAt(i)=='}'&& (char)st.peek()=='{'){
		                st.pop();
		            }
		            else{
		                st.push(s.charAt(i));
		            }
		        }
		    }
		    
		    if(st.size()==0){
		        return true;
		    }
		    return false;
		    }
}
