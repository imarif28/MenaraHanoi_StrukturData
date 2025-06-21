# Tower of Hanoi Using Stack

## Project Description

This project demonstrates the implementation of the Tower of Hanoi game using a custom Stack class in Java. The program was developed as part of the Data Structure Practicum course.

## Features

- Simulates the Tower of Hanoi game using three stacks.
- Allows users to input the source and destination stacks for disk movement.
- Validates user moves according to the Tower of Hanoi rules.
- Ends the game when the puzzle is solved or the move limit is reached.

## Technologies Used

- **Programming Language:** Java
- **IDE:** NetBeans

## How the Program Works

### Main Class (`MenaraHanoiGame`)
1. **Initialization:**
   - Creates three `Stack` objects (`s1`, `s2`, `s3`), each with a maximum capacity of 4.
   - Stack `s1` is filled with disks in descending order.

2. **Game Logic:**
   - Continuously prompts the user for input (source and destination stacks) within a `while` loop.
   - Validates user input and performs the disk movement using `push` and `pop` methods.
   - Checks if the game is won (all disks moved to `s2` or `s3`) or lost (move limit reached).

3. **Game Status:**
   - Displays the status of all stacks after each move.
   - Ends the game with a win or fail message.

### Stack Class (`Stack`)
1. **Core Operations:**
   - `push`: Adds an element to the stack.
   - `pop`: Removes and returns the top element of the stack.
   - `peek`: Retrieves the top element without removing it.

2. **Utility Methods:**
   - `isEmpty`: Checks if the stack is empty.
   - `isFull`: Checks if the stack is full.
   - `fill`: Fills the stack with given values.
   - `tampil`: Displays stack elements from top to bottom.

3. **String Representation:**
   - Converts the stack contents into a readable string format using `toString`.

## Program Output

1. **Initial Screen:**  
   Displays the initial state of the stacks.

2. **Win Condition:**  
   A message is displayed when all disks are successfully moved to the destination stack.

3. **Fail Condition:**  
   A message is displayed when the move limit is reached.

## Installation and Usage

1. **Setup:**
   - Open the project in NetBeans.
   - Compile and run the program.

2. **Usage Instructions:**
   - Enter the source and destination stacks to move a disk.
   - Follow the Tower of Hanoi rules: only smaller disks can be placed on larger disks.

## Developer

- **Name:** Ilham Muhammad Arif  
- **Course:** Data Structures Practicum  
- **Institution:** Politeknik Negeri Semarang  
- **Supervisor:** Muttabik Lathief, S.Kom., M.Eng.  
