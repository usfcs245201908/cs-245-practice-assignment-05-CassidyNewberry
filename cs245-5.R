library(tidyverse)
library(magrittr) 
library(scales) 

x<-c(50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000) 
merge<-c(19, 20, 32, 49, 32, 39, 46, 52, 59, 69 )
insertion<-c(378, 1480, 3433, 5922, 8841, 12350, 17915, 24145, 35553, 34282)
quick<-c(25, 30, 65, 107, 163, 232, 355, 436, 486, 614 )

sort <- data.frame("Size of Array"=x, "Merge Sort"= merge, "Insertion Runtime"= insertion, "QuickSort Runtime"= quick)

sort %>% 
  ggplot()+
  geom_line(aes(x=Size.of.Array, y=Merge.Sort), color="red")+
  geom_line(aes(x=Size.of.Array, y=Insertion.Runtime), color="dodgerblue")+
  geom_line(aes(x=Size.of.Array, y=QuickSort.Runtime), color="yellow")+
  scale_x_continuous(name= "Size of Array", labels=comma)+
  scale_y_continuous(name="Time (ms)", labels=comma)+
  ggtitle("Figure 1: Graph of run timing")+
  theme(plot.title = element_text(hjust = 0.5))+
  geom_text(x=450000, y=30000, label="Insertion Sort", color="dodgerblue")+
  geom_text(x=450000, y=2000, label="Quick Sort", color="yellow")+
  geom_text(x=450000, y=500, label="Insertion Sort", color="red")


ggsave("SortingRuntime-ex5.pdf")    
