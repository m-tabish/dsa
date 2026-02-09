package main

import "fmt"

func sum1n() {
	var n int

	fmt.Print("Enter the number: ")

	fmt.Scan(&n)

	i := 0
	for i <= n {
		fmt.Println(i)
		i++
	}
}
