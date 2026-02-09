// Write a program that computes the sum of an alternating series where each element of the series is an expression of the form  for each value of k from 1 to a million, multiplied by 4. Or, in more mathematical notation

package main

import (
	"fmt"
	"math"
)

func alternate() {

	sum := float64(0)
	for i := float64(1); i <= math.Pow10(6); i++ {
		sum += 4 * (math.Pow(-1, float64(i+1)) / float64((2*i - 1)))
	}

	fmt.Println(sum)
}
