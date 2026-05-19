public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.printStudent();
        SecondLargest secondLargest =new SecondLargest ();
        secondLargest.findSecondLargest();
        SortAnArray sorter = new SortAnArray();
        sorter.sortAnArray();
        MinMaxSalary  minMaxSalary = new MinMaxSalary();
        minMaxSalary.minAndMaxSalary();
        CheckPrime checkPrime = new CheckPrime ();
        checkPrime.checkPrime();
        AlternatePrimeNumber alternatePrimeNumber = new AlternatePrimeNumber ();
        alternatePrimeNumber.alternatePrimeNumber();
        ReverseASentance  reverseASentance = new ReverseASentance ();
        reverseASentance.reverseASentance();
        ReverseAnArray  reverseAnArray = new ReverseAnArray();
        reverseAnArray.reverseAnArray();
        CharacterCount  characterCount = new CharacterCount ();
        characterCount.characterCount ();
        System.out.println("\n--- Kth Smallest ---");
        KthSmallest kthSmallest = new KthSmallest();
        kthSmallest.kthSmallest();
        System.out.println("\n--- 2nd Smallest ---");
        SecondSmallest secondSmallest = new SecondSmallest();
        secondSmallest.getSecondSmallest();
    }
}