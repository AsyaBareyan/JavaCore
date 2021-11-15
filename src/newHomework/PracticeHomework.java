package newHomework;

public class PracticeHomework {
    long convert(int miutes){
        return miutes*60;
    }
    int calcAge(int years){
        return 365*years;
    }
    int nextNumber(int number){
        return ++number;
    }
    boolean isSameNum(int a,int b){
        return a==b;
    }

    boolean lessThanOrEqualToZero(int number){
        return number <= 0;
    }
    boolean reverseBool(boolean value){
        return !value;
    }
    int maxLenght(int[]array1,int[]array2){
        return array1.length>array2.length? array1.length:array2.length;
    }
}
