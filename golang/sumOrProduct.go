package main

import "fmt"

func sumOrProduct() {
	var n int

	fmt.Print("Enter the number: ")
	fmt.Scan(&n)

	sum := 0
	for i := 1; i <= n; i++ {
		sum += i
	}

	fmt.Printf("Sum is : %d", sum)
}
