
import java.io.*;
import java.util.*;


class Solution{
    int countCoPrime(int arr[], int n)
    {
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(gcd(arr[i],arr[i-1])!=1)c++;
        }
        return c;
    }
    int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b)a=a%b;
            else b=b%a;
        }
        if(a!=0)return a;
        return b;
    }
}

