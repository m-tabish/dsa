package main

import "fmt"

func input() {
	var i int

	fmt.Print("Type a number")
	fmt.Scanln(&i)
	fmt.Println("Your number is : ", i)

}
