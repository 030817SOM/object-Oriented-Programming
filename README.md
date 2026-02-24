# Java OOP Bank System


##  Project Description
This is a console-based banking system developed in Java using Object-Oriented Programming (OOP) principles.  
The system allows users to create accounts, deposit money, withdraw money, view account balances, and view transaction history.
The application demonstrates clean OOP architecture with separation of concerns between:
- Account (Model)
- Bank (Service/Manager)
- Transaction (model)
- AccountTest (User Interface)
  

##Features
✔ Create new bank account  
✔ Automatically generate account numbers  
✔ Deposit money  
✔ Withdraw money 
✔ Transaction history 
✔ View account balance  
✔ Multiple accounts supported  
✔ Input validation  
✔ Encapsulation using private fields  
✔ Use of `final` for immutable identity fields  


##Project Structure
Bank System
├── Account.java
├── Bank.java
└── AccountTest.java


### Account.java
Represents a single bank account.
- Stores account details
- Handles deposit and withdrawal logic
- Automatically generates account numbers
  

###  Bank.java
Manages multiple accounts using ArrayList.
- Adds accounts
- Searches accounts by account number
  

### AccountTest.java
Main application class.
- Displays menu
- Handles user input
- Interacts with Bank and Account classes

### Transaction.java

-Stores transactions type (deposit/withdrawal)
-stores transaction amount
-stores updated balance after transaction 
  

##OOP Concepts Used
- Encapsulation
- Abstraction
- Object Composition (Bank has Accounts)
- Immutability (`final` fields)
- Static variables (automatic account number generation)
- Separation of Concerns
- basic data structures
  

## How to Run the Program
1. Open the project in IntelliJ or any Java IDE.
2. Compile all classes.
3. Run `AccountTest.java`.
4. Follow the menu instructions.
   

## Sample Menu
============== BANK SYSTEM ==============
1.	Create Account
2.	Deposit
3.	Withdraw
4.	View Balance
5.	Transaction History
6.	Exit


##Notes
- Account numbers are generated automatically.
- When performing transactions, enter the exact account number provided.
- The system runs in the console (no database yet).

  
## Future Improvements
- Add PIN authentication
- Connect to database (MySQL)
- Convert to Spring Boot REST API
- Add GUI (JavaFX or Web Frontend)
- Persist data after program restart

## Author
Developed by Wanga  
Java Backend Practice Project

