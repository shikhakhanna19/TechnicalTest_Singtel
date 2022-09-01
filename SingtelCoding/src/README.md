# TechnicalTest_Singtel

Question A.

1.We Can implement the sing() method for the bird by two ways :
   •	Can add new method in bird class :  public String sing(){}
   •	Create an interface CanSing that have sing() method that can   
    be implemented by Bird class. 
  
  1.	Unit test Case @ : SingtelCoding/src/com/testA/ assignmentTest_A/SolutionA1_Test.java
  2.	We can optimize the code for maintainability by creating Interfaces for all the different features of Animals like CanSwim, CanWalk etc.
    
2.Now, we have 2 special kinds of birds: the Duck and the Chicken ... Can you Implementation of  the Duck and the Chicken class for making their own special sound and    
 inherited from Bird Class.

  Solution @ :  SingtelCoding/src/com/assignment_A2/SolutionA2.java
  Unit Test @ : SingtelCoding/src/com/testA/assignmentTest_A/SolutionA2_Test.java

3.Now how would you model a rooster?
   1.A rooster says: “ Cock-a-doodle-doo ” 
          Solution @ : SingtelCoding/src/com/assignment_A3/SolutionA3.java
          Unit Test Case @: SingtelCoding/src/com/testA/assignmentTest_A/SolutionA3_Test.java

   2.How is the rooster related to the chicken? 
       They both inherited same parent class i.e. Bird


4.Model of  a parrot with different sound(as per its surroundings)
   
   Solution @ : SingtelCoding/src/com/assignment_A4/Solution4.java
   Unit Test Case @: SingtelCoding/src/com/testA/assignmentTest_A/SolutionA4_Test.java

  •	How do you keep the parrot maintainable? What if we need another parrot lives
              near a Duck? Or near a phone that rings frequently?

   Parrot can be maintainable using Composition (Has-A relationship) like parrot has a relationship with cat, dog, duck and rooster. This way we can easily upgrade it  
   with others like with Phone    
 
   Solution @ : SingtelCoding/src/com/assignment_A4/Solution4.java
   Unit Test Case @: SingtelCoding/src/com/testA/assignmentTest_A/SolutionA4_Test.java


   -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   

Question B. Model fish as well as other swimming animals


1.In addition to the birds, can you model a fish?
   Solution @ : SingtelCoding/src/com/assignment_B1/Solution1.java
   Unit Test Case @: SingtelCoding/src/com/testB/assignmentTest_B/SolutionB1_Test.java
   
2.Can you specialize the fish as a Shark and as a Clownfish?
    
   Solution @ : SingtelCoding/src/com/assignment_B2/Solution2.java
   Unit Test Case @: SingtelCoding/src/com/testB/assignmentTest_B/SolutionB2_Test.java

3.Dolphin s are not exactly f ish, yet, they are good swimmers
  
  Solution @ : SingtelCoding/src/com/assignment_B3/Solution3.java
  Unit Test Case @: SingtelCoding/src/com/testB/assignmentTest_B/SolutionB3_Test.java

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Question C. Model animals that change their behaviour over time

1. Can you model a butterfly?

   Solution @ : SingtelCoding/src/com/assignment_C1/SolutionC1.java
   Unit Test Case @: SingtelCoding/src/com/testC/assignmentTest_C/SolutionC1_Test.java

2. Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?

   Solution @ : SingtelCoding/src/com/assignment_C2/SolutionC2.java
   Unit Test Case @: SingtelCoding/src/com/testC/assignmentTest_C/SolutionC2_Test.java

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Question D. Counting animals
    Solution @ : SingtelCoding/src/com/assignment_D/SolutionD.java
    Unit Test Case @: SingtelCoding/src/com/testD/assignmentTest_D/SolutionD_Test.java


------------------------------------------------------------------------------------------------------------------------------------------------------------------------
