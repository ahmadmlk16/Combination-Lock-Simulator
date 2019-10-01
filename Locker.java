import java.util.Scanner;
public class Locker {
    int lockerNumber;
    String name;
    int numBooks;
    CombinationLock lock;
//default constructor
    Locker()
    {

        lock = new CombinationLock();

        lockerNumber = 0;

        name = "";

        numBooks = 0;

    }
    // parameterized constructor
    public Locker(int lockerNumber, String name, int numBooks, CombinationLock lock)
    {
        this.lockerNumber = lockerNumber;
        this.name = name;
        this.numBooks = numBooks;
        this.lock = lock;
    }
    //function to get locker number
    public int getLockerNumber()
    {
        return lockerNumber;
    }
    // assign locker number
    public void setLockerNumber(int lockerNumber)
    {
        this.lockerNumber = lockerNumber;
    }
    // to getname function to retrieve name
    public String getName()
    {
        return name;
    }
    // setter method to set the name
    public void setName(String name)
    {
        this.name = name;
    }
    public int getNumBooks()
    {
        return numBooks;
    }
    public void setNumBooks(int numBooks)
    {
        this.numBooks = numBooks;
    }
    public CombinationLock getLock()
    {
        return lock;
    }
    public void setLock(CombinationLock lock)
    {
        this.lock = lock;
    }
    public void putBookInLocker()
    {
        numBooks += 1;
    }
    public void removeBookFromLocker()
    {
        if(numBooks > 0)
            numBooks -= 1;
    }
    public void openLocker()
    {
        // prompt and read the input from the console
        Scanner in = new Scanner(System.in);
        int c1, c2, c3;
        System.out.print("Enter First Number: ");
        c1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        c2 = in.nextInt();
        System.out.print("Enter Third Number: ");
        c3 = in.nextInt();
        if(lock.openLock(c1, c2, c3))
        {
            System.out.println("Your locker successfully opened");
        }
        else
        {
            System.out.println("Wrong Number");
        }
        // close the scanner object
        in.close();
    }
    @Override
    public String toString()
    {
        return "Locker [lockerNumber=" + lockerNumber + ", name=" + name + ", numBooks=" + numBooks + ", lock=" + lock.toString() + "]";
    }
}