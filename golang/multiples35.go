package main

import "fmt"

func multiples35() {

	sum := 0
	for i := 1; i <= 17; i++ {
		if i%3 == 0 || i%5 == 0 {
			fmt.Print("Values :", i)
			fmt.Print("\n")
			sum += i
		}
	}

	fmt.Print("Sum is :", sum)
}
