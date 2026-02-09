package main

import "fmt"

func greet() {
	var name string
	var name2 string

	fmt.Println("ENter the name ")
	fmt.Scanln(&name)
	fmt.Println("ENter the name of second")
	fmt.Scanln(&name2)
	fmt.Printf("Hello %s and %s", name, name2)

}
