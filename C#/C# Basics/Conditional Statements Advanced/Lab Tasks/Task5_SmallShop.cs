﻿using System;

namespace Task5_SmallShop
{
    class Task5_SmallShop
    {
        static void Main(string[] args)
        {
            string product = Console.ReadLine();
            string town = Console.ReadLine();
            double quantity = double.Parse(Console.ReadLine());
            double totalPrice = 0;
            
            switch (town)
            {
                case "Sofia":
                    switch(product)
                    {
                        case "coffee":
                            totalPrice = quantity * 0.5; 
                            break;
                        case "water":
                            totalPrice = quantity * 0.8;
                            break;
                        case "beer":
                            totalPrice = quantity * 1.2;
                            break;
                        case "sweets":
                            totalPrice = quantity * 1.45;
                            break;
                        case "peanuts":
                            totalPrice = quantity * 1.60;
                            break;
                    }
                    break;
             
                case "Plovdiv":
                    switch (product)
                    {
                        case "coffee":
                            totalPrice = quantity * 0.4;
                            break;
                        case "water":
                            totalPrice = quantity * 0.7;
                            break;
                        case "beer":
                            totalPrice = quantity * 1.15;
                            break;
                        case "sweets":
                            totalPrice = quantity * 1.30;
                            break;
                        case "peanuts":
                            totalPrice = quantity * 1.50;
                            break;
                    }
                    break;
                case "Varna":
                    switch (product)
                    {
                        case "coffee":
                            totalPrice = quantity * 0.45;
                            break;
                        case "water":
                            totalPrice = quantity * 0.7;
                            break;
                        case "beer":
                            totalPrice = quantity * 1.10;
                            break;
                        case "sweets":
                            totalPrice = quantity * 1.35;
                            break;
                        case "peanuts":
                            totalPrice = quantity * 1.55;
                            break;
                    }
                    break;
                   

            }

            Console.WriteLine(totalPrice);



        }
    }
}
