package JavaPractice;

public class Assignment_opr {

	public static void main(String[] args) {
		 
		        // Declaring and initializing variables
		        int x = 5;
		        int y = 10;
		        
		        // Assignment operator: =
		        int Z = x + y; // Assign the result of x + y to result1
		        System.out.println("Result1: " + Z); // Output: Result1: 15
		        
		        // Compound assignment operators
		        // += : Add and assign
		        Z += 5; // Equivalent to: result1 = result1 + 5;
		        System.out.println("Result1 after += 5: " + Z); // Output: Result1 after += 5: 20
		        
		        // -= : Subtract and assign
		        Z -= 3; // Equivalent to: result1 = result1 - 3;
		        System.out.println("Result1 after -= 3: " + Z); // Output: Result1 after -= 3: 17
		        
		        // *= : Multiply and assign
		        Z *= 2; // Equivalent to: result1 = result1 * 2;
		        System.out.println("Result1 after *= 2: " + Z); // Output: Result1 after *= 2: 34
		        
		        // /= : Divide and assign
		        Z /= 4; // Equivalent to: result1 = result1 / 4;
		        System.out.println("Result1 after /= 4: " + Z); // Output: Result1 after /= 4: 8
		        
		        // %= : Modulus and assign
		        Z %= 3; // Equivalent to: result1 = result1 % 3;
		        System.out.println("Result1 after %= 3: " + Z); // Output: Result1 after %= 3: 2
		        
		        // <<= : Left shift and assign
		        Z <<= 2; // Equivalent to: result1 = result1 << 2;
		        System.out.println("Result1 after <<= 2: " + Z); // Output: Result1 after <<= 2: 8
		        
		        // >>= : Right shift and assign
		        Z >>= 1; // Equivalent to: result1 = result1 >> 1;
		        System.out.println("Result1 after >>= 1: " + Z); // Output: Result1 after >>= 1: 4
		        
		        // &= : Bitwise AND and assign
		        Z &= 3; // Equivalent to: result1 = result1 & 3;
		        System.out.println("Result1 after &= 3: " + Z); // Output: Result1 after &= 3: 0
		        
		        // |= : Bitwise OR and assign
		        Z |= 5; // Equivalent to: result1 = result1 | 5;
		        System.out.println("Result1 after |= 5: " + Z); // Output: Result1 after |= 5: 5
		        
		        // ^= : Bitwise XOR and assign
		        Z ^= 3; // Equivalent to: result1 = result1 ^ 3;
		        System.out.println("Result1 after ^= 3: " + Z); // Output: Result1 after ^= 3: 6
		    }
		}


