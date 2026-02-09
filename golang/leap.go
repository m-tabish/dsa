// Write a program that prints the next 20 leap years.
// check year 1900 was not a leap year
package main

import "fmt"

func leap() {
	var n int
	fmt.Print("enter the first year")
	fmt.Scan(&n)

	// every 4 years and every 400 hundred

	for i := 0; i < 20; i++ {
		n += 4
		fmt.Println(n)

	}
}
