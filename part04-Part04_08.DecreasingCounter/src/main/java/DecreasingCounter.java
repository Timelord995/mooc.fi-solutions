
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        if (this.value > 0){
            this.value--;
        }
        System.out.println(this.value);
        // the aim is to decrement the value of the counter by one
    }
    
    public void reset() {
        this.value = 0;
    }

    // the other methods go here
}
