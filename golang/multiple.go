package main

import "fmt"

func multiple() {
	var i int
	fmt.Print("Enter the number : ")

	fmt.Scan(&i)

	if i%3 == 0 {
		fmt.Printf("%d is multiple of 3", i)
	} else if i%5 == 0 {
		fmt.Printf("%d is multiple of 5", i)
	} else {
		fmt.Print("Not a multiple")
	}
}
