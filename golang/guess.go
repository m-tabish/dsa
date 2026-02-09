// Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small. At the end the number of tries needed should be printed. It counts only as one try if they input the same number multiple times consecutively.

package main

import "fmt"

func guess() {
	var n int
	tries := 0
	secret := 23
	var prev int
	for {
		fmt.Println("Enter the number: ")
		fmt.Scan(&n)
		if prev != n {
			tries++
		}
		prev = n
		if n < secret {
			fmt.Print("Too small\n")
		} else if n > secret {
			fmt.Print("Too large\n")
		} else {
			fmt.Print("Number of Tries: ", tries)
			break
		}
	}
}
