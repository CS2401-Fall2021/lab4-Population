# lab4-Population

## Introduction

Ecology is the study of the relationships between living organisms and their physical environment. Population size is a commonly used measurement. However there are innumerable factors that can contribute to a species population size. One important facton however, is the predator-prey relationship. This has been studdied in-depth through looking at the populations of the moose and wolf populations on Isle Royale. For more details on the long-term study see https://isleroyalewolf.org/data/data/home.html. 

![populations](https://www.duluthnewstribune.com/incoming/article1714205.ece/alternates/BASE_LANDSCAPE/4219309%2B051718moose.jpg)

Ecologists try to come up with Population Models in order to predict what will happen to a population over several years. In general, this involves a relationship between this year's population and the previous years. 

## Modeling a Moose Population in Paradise
![paradise](https://i5.walmartimages.com/asr/1322e8cf-02cb-42b0-957c-5f67c4d33ad5_1.ed3040664283e11a726301a23f5e4332.jpeg?odnWidth=612&odnHeight=612&odnBg=ffffff)
First, let's assume we have a moose paradise with no predators, infinite resources, and every moose lives to full maturity. Assume the following statistics:

*Each year in the Spring, 10% of the moose population produce a baby moose calf. 
*Every year in the Fall, 6% of the moose population dies due to old age.

Your lab notes are incredibly messy and while you know at some point, a herd of <20 moose were added to the moose paradise, you don't know exactly when or exactly how many there were at the begining. Furthermore, you're still waiting on this year's population count to come in, so you don't quite know the exact number. To make things worse, your boss is looking for your report to be finished as soon as possible in order to get your team more funding for moose-counting. What can you do? Write a function that takes the current population to determine when the first 10 moose came to your moose paradise.

### Method 1
Should you do this recursively? Or iteratively? Why might one be better than the other? 
Implement the proposed solution. 

### Method 2
What if you knew exactly how many moose started in the moose paradise? Which approach should you use? 
Implement the propsed solution

## Introducing predators

!(moon_moon)[https://i.pinimg.com/originals/52/ea/da/52eada7605adb6384de1d5575cecd188.jpg]
Sadly it turns out your Moose Paradise Department had to merge with the Wolf Pack Research Organization due to a string of budget cuts. This certainly complicates your population model. 


*Each year in the Spring, 10% of the moose population produce a baby moose calf. 
*Every year in the Fall, 6% of the moose population dies due to old age.
*Every year in the winter, each wolf kills 2 moose for food

*Each year in the Spring, 4% of the wolf population produce a wolf baby. 
*Every year in the Fall, 6% of the wolf population dies due to old age.


### Method 3
You are tasked with predicting the population in 50 years, but you don't know exactly how many moose or wolves are there to start, but as soon as your grad students come back from counting, you want to be ready to submit your report to the department. 

Should you do this recursively? Or iteratively? Why might one be better than the other? 
Implement the proposed solution. 

### Method 4
Good news! You got a grant to start a smaller study where you get to choose how many moose you bring into a population of 5 wolves. But your grant requires you to have exactly 200 moose and 25 wolves at some point in the next 50 years. How many moose do you start with? 
What if you knew exactly how many moose started in the moose paradise? Which approach should you use? 
Implement the propsed solution
