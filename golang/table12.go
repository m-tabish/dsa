package main

import "fmt"

func table12() {

	for i := 1; i <= 12; i++ {
		for j := 1; j <= 10; j++ {
			prod := i * j
			fmt.Printf("%d x %d = %d \n", i, j, prod)
		}
		fmt.Println("")
	}

}
