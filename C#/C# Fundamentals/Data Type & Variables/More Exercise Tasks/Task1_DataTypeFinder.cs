﻿using System;

namespace Task1_DataTypeFinder
{
    class Task1_DataTypeFinder
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();

            if(Int32.TryParse(input,out _))
            {
                Console.WriteLine($"{input} is integer type");
            }
            else if(double.TryParse(input, out _))
            {
                Console.WriteLine($"{input} is floating point type");
            }    
            else if(bool.TryParse(input, out _))
            {
                Console.WriteLine($"{input} is boolean type");
            }
            else if(char.TryParse(input, out _))
            {
                Console.WriteLine($"{input} is character type");
            }
            else
            {
                Console.WriteLine($"{input} is string type");
            }
        }
    }
}
