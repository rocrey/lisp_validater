package com.example.lisp_validaotr;

public class lisp_validator {
    public static void main(String[] args){
        String lisp_string = args[0];
        int counter = 0;
        for(int i = 0; i < lisp_string.length(); i++){
            if (lisp_string.charAt(i) == '('){
                counter++;
            }
            else if (lisp_string.charAt(i) == ')'){
                counter--;
            }
            if (counter < 0) break;
        }
        //Java normally returns 0 if the program executed successfully without fail
        //So returned 1 here to indicated the program failed.
        if (counter != 0) System.exit(1);
        else System.exit(0);
    }
}
