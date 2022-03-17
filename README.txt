Group member: Yufei Zhao, Jiayi He

NetID: yzhao87, jhe36

Class: 2021_Spring_CSC_242

ReadMe File for Project4

Files:

For the classes in learn/lc/core:
1.We implemented update method and sigmoid threshold method in LogisticClassifier.java
2.We implemented update method and hard threshold method in PerceptronClassifier.java

For the classes in learn/lc/display:
1.This class is ClassifierDisplay that used for display in examples folder.

For the classes in learn/lc/examples:
1.Data.java is class to read data from file.
2.LogisticClassifierTest is for testing Logistic Classifier.
3.LogisticClassifierWithDisplay can display.
4.LogisticClassifierEarthquakeClean/ Noisy / NoisyDecaying/ HouseVotes /5.HouseVotesNoisyDecaying are classes for testing LogisticClassifier without enter parameters.
6.PerceptronClassifierTest is for testing Perceptron Classifier.
7.PerceptronClassifierWithDisplay can display.
8.PerceptronClassifier Clean/ Noisy / NoisyDecaying/ HouseVotes /HouseVotesNoisyDecaying are classes for testing PerceptronClassifier without enter parameters.

For the classes in learn/nn/core:
1.We implemented activation method and update method in LogisticUnit.java
2.We implemented activation method and update method in PerceptronUnit.java
3.We implemented train method in SingleLayerFeedForwardNeuralNetwork.java
4.We implemented backdrop method in MultilayerFeedForwardNeuralNetwork.java

Other code are provided by blackboard zip

!!!How to run!!!

1.cd to src directory: cd src

2.Compile all the classes in the src directory:

javac learn/lc/core/*.java learn/lc/examples/*.java learn/lc/display/*.java learn/math/util/*.java

3.Please enter: “java learn/lc/examples/” before the classname to run classifier

java learn/lc/examples/[classname]

For example: java learn/lc/examples/LogisticClassifierEarthquakeNoisy
	You can test all the LogsiticClassifier or PerceptronClassifier with this form, so you don’t need to enter any parameter. It is same as entering parameter in LogisticClassifierTest and PerceptronClassifierTest.

4.If you want to test with display or using classifier test directly. Please use the following format:
java learn/lc/examples/[classname] [data filename] [step you want] [alpha]

For example: java learn/lc/examples/LogisticClassifierTest earthquake-			noisy.data.txt 	10000 0.95

Running example in terminal:
RainydeMacBook-Pro:~ rainyzhao$ cd /Users/rainyzhao/Desktop/CSC242Project4/src
RainydeMacBook-Pro:src rainyzhao$ javac learn/lc/core/*.java learn/lc/examples/*.java learn/lc/display/*.java learn/math/util/*.java
RainydeMacBook-Pro:src rainyzhao$ java learn/lc/examples/LogisticClassifierHouseVotes
filename: learn/lc/examples/house-votes-84.data.num.txt
nsteps: 10000
alpha: 0.95
1	0.8407482928429595
2	0.876619887142549
3	0.8819312281470905
4	0.8857114001691174
5	0.888368748949637
6	0.8886978413995963
7	0.8938573162200845
8	0.9050179406011037
9	0.9125390026929086
10	0.9134708020066042
11	0.9172510308143417
12	0.9201054011077352
13	0.921553055097304
14	0.9214993467841246
15	0.9247174094497664
16	0.9246935122814502
17	0.9249233210116578
18	0.9291588447410879
19	0.9294564143042542
20	0.9298138778500851
...


RainydeMacBook-Pro:src rainyzhao$ java learn/lc/examples/LogisticClassifierHouseVotesDecaying
filename: learn/lc/examples/house-votes-84.data.num.txt
nsteps: 10000
alpha: 0.0
1	0.8733941169077026
2	0.8888017109258721
3	0.8950862835621498
4	0.899325117321751
5	0.9146083891801318
6	0.9160924524851614
7	0.9160106651931053
8	0.9163985958626881
9	0.8801687496360618
10	0.9111177411012898
11	0.9305222716362829
12	0.9290075756871782
13	0.9337415206660467
14	0.9380076537718354
15	0.9385562878487594
16	0.9410153969540417
17	0.9422122832281554
18	0.9426618721199937
19	0.9425730763544956
20	0.942891861007473
...

RainydeMacBook-Pro:src rainyzhao$ java learn/lc/examples/PerceptronClassifierEarthquakeNoisy
filename: learn/lc/examples/earthquake-noisy.data.txt
nsteps: 10000
alpha: 0.95
1	0.4583333333333333
2	0.5416666666666666
3	0.5416666666666666
4	0.5416666666666666
5	0.4583333333333333
6	0.4583333333333333
7	0.5416666666666666
8	0.5416666666666666
9	0.5416666666666666
10	0.4583333333333333
11	0.4583333333333333
12	0.4583333333333333
13	0.5416666666666666
14	0.5416666666666666
15	0.4583333333333333
16	0.4583333333333333
17	0.4583333333333333
18	0.5416666666666666
19	0.4583333333333333
20	0.5416666666666666
...


Extra Credit: 

!!!How to Run!!!
(Please follow the following steps one by one carefully to run the code)
1. cd to src directory: cd src
2. Compile all the classes in the src directory: 
	javac learn/nn/core/*.java learn/nn/examples/*.java learn/math/util/*.java
3. Please enter: “java learn/nn/examples/” before the class name to run classifier
	java learn/nn/examples/[classname]
	For example: java learn/nn/examples/IrisNN
ps: You can use this format to test both Iris dataset and MNIST dataset

Here is the example for us to run the code in the terminal:
RainydeMacBook-Pro:src rainyzhao$ cd /Users/rainyzhao/Desktop/CSC242Project4/src
RainydeMacBook-Pro:src rainyzhao$ javac learn/nn/core/*.java learn/nn/examples/*.java learn/math/util/*.java
RainydeMacBook-Pro:src rainyzhao$ java learn/nn/examples/IrisNN
Training for 1000 epochs with alpha=0.1
LAYER	UNIT	w_0 ...
1	0	0.02	5.15	5.51	-7.31	-8.80
1	1	-0.03	5.43	5.78	-7.68	-9.24
1	2	-0.01	-0.66	-0.90	1.11	1.78
1	3	-0.02	0.65	1.87	-3.12	-1.49
1	4	-0.02	0.63	1.69	-2.90	-1.47
1	5	0.02	-0.29	0.18	0.32	1.05
1	6	-0.02	-2.24	-2.32	3.14	4.19
2	0	-0.04	-0.57	-0.58	-2.65	4.03	3.42	-2.61	-2.00
2	1	0.00	4.22	4.56	-0.60	-6.92	-5.85	-1.14	-1.86
2	2	0.03	-5.14	-5.18	1.31	-1.65	-1.84	0.76	1.93
Overall accuracy=0.9666666666666667

Confusion matrix:
	Predicted
Actual	0	1	2
0	1.000	0.000	0.000
1	0.000	0.900	0.100
2	0.000	0.000	1.000

k-Fold Cross-Validation: n=150, k=10
SET	ACCURACY
0	1.000
1	1.000
2	1.000
3	1.000
4	0.733
5	0.867
6	1.000
7	1.000
8	0.800
9	1.000
average accuracy: 0.940

Learning Curve testing on all training data
EPOCHS	ACCURACY
100	0.867
200	0.940
300	0.947
400	0.953
500	0.953
600	0.953
700	0.953
800	0.953
900	0.960
1000	0.967
1100	0.967
1200	0.967
1300	0.967
1400	0.967
1500	0.967
1600	0.967
1700	0.967
1800	0.967
1900	0.973
2000	0.973
2100	0.980
2200	0.967
2300	0.967
2400	0.967
2500	0.973
2600	0.980
2700	0.980
2800	0.980
2900	0.967
3000	0.980




RainydeMacBook-Pro:~ rainyzhao$ cd /Users/rainyzhao/Desktop/CSC242Project4/src
RainydeMacBook-Pro:src rainyzhao$ javac learn/nn/core/*.java learn/nn/examples/*.java learn/math/util/*.java
RainydeMacBook-Pro:src rainyzhao$ java learn/nn/examples/MNISTNN
MNIST: reading training data...
MNIST: reading testing data...
MNIST: training on 60000 examples for 100 epochs, alpha=0.1
MNIST: testing on 10000 examples
EPOCH	ACC	TIMEms	HHMMSS
1	0.446	809398	00:13:29
2	0.477	798548	00:13:18
3	0.349	773397	00:12:53
4	0.300	772705	00:12:52
5	0.280	830411	00:13:50
6	0.487	841200	00:14:01


Ps(Very important, please read carefully)
1.  Both class can be run, since we have been run them in different computers' terminals. Please enter 'learn/lc/examples/' before any class you want to run or there may lead file no found problem. (E.g. java learn/lc/examples/PerceptronClassifierEarthquakeNoisy)
2.  The working directory is the parent of the src directory.
3.  For the extra credit part, the test for the MNIST dataset takes very long time which means we could only get very few examples in limited time. 

PLEASE FOLLOW THE INSTRUCTION IN 'HOW TO RUN' CAREFULLY