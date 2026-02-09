// Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.

package main

import "fmt"

func possibility() {
	var n int
	var choice int

	fmt.Print("Enter the number: ")
	fmt.Scan(&n)
	fmt.Print("Enter the 0 for sum and 1 for product: ")
	fmt.Scan(&choice)

	if choice == 0 {
		sum := 0
		for i := 1; i <= n; i++ {
			sum += i
		}

		fmt.Print("Sum is : ", sum)
	} else {
		prod := 1
		for i := 1; i <= n; i++ {
			prod *= i
		}

		fmt.Print("Sum is : ", prod)
	}
}
