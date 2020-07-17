package main;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.util.function.*;
import java.math.*;
import java.util.regex.*;
import support.*;
import java.lang.reflect.*;
import java.lang.annotation.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.atomic.*;


public class Open{
	
	public static void main(String[] args) throws Exception {
		String ANSI_BLOCK = "\u001B[32m";
		String ANSI_RESET = "\u001B[0m";
		String ANSI_RED = "\u001B[31m";
		//BlOCK 1
		System.out.println(ANSI_BLOCK + "BLOCK 1" + ANSI_RESET);
		//Case 1
		System.out.print("1) ");
		String s = "123454321";
		System.out.println(checkPalindrom(s));
		//Case 2
		System.out.print("2) ");
		for (int i=0; i<13; i++)
			printFibonacci(i);
		System.out.print('\n');
		//Case 3
		System.out.print("3) ");
		calculateAndPrint(1337);
		calculateAndPrint(1488);
		calculateAndPrint(1211);
		System.out.print('\n');
		//Case 4
		System.out.print("4) ");
		int array[] = {2, 1, 4, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 3, 1, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
		int array2[] = {2, 1, 4, 1, 2, 3, 4, 5, 6, 7, 3, 1}; 
		int array3[] = {1, 5, 7, 2};
		checkSortArrayLength(array);
		checkSortArrayLength(array2);
		checkSortArrayLength(array3);
		System.out.print('\n');
		//Case 5
		System.out.print("5) ");
		NodeImpl oneNode = new NodeImpl(0);
		oneNode.setNext(new NodeImpl(1));
		oneNode.setNext(new NodeImpl(2));
		oneNode.setNext(new NodeImpl(3));
		oneNode.setNext(new NodeImpl(4));
		;
		NodeImpl testNodeInput=oneNode;
		while (testNodeInput!=null) {
			System.out.print(testNodeInput.value+ ". ");
			testNodeInput= (NodeImpl) testNodeInput.getNext();	
		}
		System.out.print(" -  ");
		
		NodeImpl tab=reverse(oneNode);
		
		testNodeInput=tab;
		while (testNodeInput!=null) {
			System.out.print(testNodeInput.value+ ". ");
			testNodeInput= (NodeImpl) testNodeInput.getNext(); 
		}
		System.out.print('\n');
		//Case 6
		System.out.print("6) ");
		Node2 n25 = new Node2(10, null);
		Node2 n24 = new Node2(7, n25);
		Node2 n23 = new Node2(5, n24);
		Node2 n22 = new Node2(2, n23);
		Node2 n21 = new Node2(1, n22);
		
		Node2 nTest=n21;
		while (nTest!=null) {
			System.out.print(nTest.getData()+". ");
			nTest=nTest.getNext();
		}
		System.out.print(" -  ");
		Node2 l24 = new Node2(8, null);
		Node2 l23 = new Node2(4, l24);
		Node2 l22 = new Node2(1, l23);
		Node2 l21 = new Node2(1, l22);
		
		Node2 lTest=l21;
		while (lTest!=null) {
			System.out.print(lTest.getData()+". ");
			lTest=lTest.getNext();
		}

		System.out.print("  merge  ");
		Node2 Result=merge(n21, l21);
		while (Result!=null) {
			System.out.print(Result.getData()+". ");
			Result=Result.getNext();
		}
		System.out.print('\n');
		//Case 7
		System.out.print("7) ");
		Tree t4 = new Tree(4, null, null);
		Tree t6 = new Tree(6, null, null);
		Tree t5 = new Tree(5, t4, t6);
		Tree t11 = new Tree(11, null, null);
		Tree t10 = new Tree(10, null, t11);
		Tree t8 = new Tree(8, null, t10);
		Tree root = new Tree(7, t5, t8);
		int deepTree=treeDepth(root);
		System.out.println("Deep of BTree - "+ deepTree);
		//Case 8
		System.out.print("8) ");
		System.out.print("Count of leafs - ");
		System.out.println(treeLeafCount(root));
		//BLOCK 2
		System.out.println(ANSI_BLOCK + "BLOCK 2" + ANSI_RESET);
		//Case 1
		System.out.print("1) ");
		Object[] b2arr = new Object[5];
		for (int i=0; i<b2arr.length; i++) {
			if (i%2==0)
				b2arr[i]=new FruitOne();
			else
				b2arr[i]=new FruitTwo();
		}
		checkFruitCount(b2arr);
		//BLOCK 3
		System.out.println(ANSI_BLOCK + "BLOCK 3" + ANSI_RESET);
		//Case 1
		System.out.print("1) ");
		int reversedDigit=reverseDigit(543716);
		System.out.println(reversedDigit);
		//Case 2
		System.out.print("2) ");
		int actuall=0xfe01ccd1;
		int revByte=reverseByte(actuall);
		System.out.println("Actual digit is " + Integer.toHexString(actuall)+" reversByte is" +Integer.toHexString(revByte));
		//BLOCK 4
		System.out.println(ANSI_BLOCK + "BLOCK 4" + ANSI_RESET);
		//Case 1
		String expression="72/12-8*(1+4)";
		System.out.print("1) "+ expression);
		System.out.println(calculate(expression));
		//Case 2
		System.out.print("2) ");
		MyBigNumber a = new MyBigNumber("-20504962648058829508634537240139148734");
		MyBigNumber b = new MyBigNumber("-469915985327887");
		System.out.println("add: " +a.add(b).toString()+"\nsub: "+a.sub(b)+"\ncmp: "+ a.compareTo(b));
		//Case 3
		System.out.print("3) ");
		findAllUrl("rhrthr https://stepik.org edtrhert r113223@12 https://wererwg.ru erwg3rg@123009https\r\n" + 
				"rhrthr http://sfrgeee.org/ewfef/wqewrg\r\n" + 
				"5476y65yyyyyh$%&$\r\n" + 
				"https://makedreamprofits.ru/?utm_source=ewqee&utm_medium=qew");
		//BLOCK 5
		System.out.print(ANSI_BLOCK + "BLOCK 5"+ ANSI_RESET + "\n1) ");
		//Case 1
		ComplexDigit c1=(ComplexDigit) createComplex(1, 3);
		ComplexDigit c2=(ComplexDigit) createComplex(2, 1);
		System.out.println("c1 is "+ c1.toString()+ " c2 is " +c2.toString());
		ComplexDigit cSum=(ComplexDigit) c1.sum(c2);
		ComplexDigit cSub=(ComplexDigit) c1.sub(c2);
		ComplexDigit cMul=(ComplexDigit) c1.mul(c2);
		System.out.println("c1+c2 = "+cSum.toString()+" c1-c2 = "+cSub.toString()+ " c1*c2 = "+cMul.toString());
		ComplexDigit c3=(ComplexDigit) createComplex(4.14, 7);
		ComplexDigit c4=(ComplexDigit) createComplex(4.1378, 7);
		System.out.println("c3 - " + c3.toString() + " equals c4 - " + c4.toString() +" "+c3.equals(c4));
		//BLOCK 6
		System.out.print(ANSI_BLOCK + "BLOCK 6"+ ANSI_RESET + "\n1)");
		//Case 1
		//generateStackOverflowError();
		System.out.println( ANSI_RED + " Exception in thread \"main\" java.lang.StackOverflowError\n" + 
		ANSI_RESET + "Uncomment line 182 for look solution");
		//Case 2
		//generateOutOfMemoryError();
		System.out.println("2)" + ANSI_RED + " Exception in thread \"main\" java.lang.OutOfMemoryError\n" + 
		ANSI_RESET + "Uncomment line 186 for look solution");
		//Case 3
		System.out.println("3)" + ANSI_RED +" Exception in thread \"main\" java.lang.ClassCastException\n" + 
		ANSI_RESET + "Uncomment line 193 for look solution");
		List<Integer> list =  generateBadList();
		//System.out.println(badListSum(list));
		//Case 4
		System.out.println("4)" + ANSI_RED +" Exception in thread \"main\" java.lang.ConcurrentModificationException\n" + 
				ANSI_RESET + "Uncomment line 201 for look solution");
		List<Integer> list2 = new LinkedList<Integer>();
		for (int i=0; i<7; i++) {
			list2.add(i);
		}
		//genConcurrentModificationException(list2);
		//BLOCK 7
		System.out.print(ANSI_BLOCK + "BLOCK 7"+ ANSI_RESET + "\n1) ");
		//Case 1
		Box<Integer> box = boxingValue(12.3);
		System.out.println("Box<Integer> value is " + box.getValue());
		//Case 2
		FactoryC fC = new FactoryC();
		FactoryB fB = new FactoryB();
		System.out.println("2) Actual instance "+ fC.generateInstance().getClass().getName() + " Expexted support.C\n"
				+ "Actual instance "+ fB.generateInstance().getClass().getName() + " Expexted support.B");
		//BLOCK 8
		System.out.print(ANSI_BLOCK + "BLOCK 8"+ ANSI_RESET + "\n1)");
		//Case 1
		FibonacciIterator fibIter = new FibonacciIterator();
		int iterCount=0;
		while(fibIter.hasNext()) {
			fibIter.next();
			iterCount++;
		}
		System.out.println(" Iterator did "+iterCount+" iteration for type Integer");
		//Case 2
		System.out.print("2) Tree iterator in for-each loop: ");
		for (Tree x: root) {
			System.out.print(x.getValue()+" ");
		}
		System.out.print("\n3) ");
		List<Tree> treeList = new LinkedList<>();
		treeList.add(t6);
		treeList.add(t5);
		treeList.add(t11);
		treeList.add(root);
		treeList.add(t10);
		treeList.add(t4);
		treeList.add(t8);
		setParents(treeList);
		System.out.print('\n');
		//BLOCK 9
		System.out.print(ANSI_BLOCK + "BLOCK 9"+ ANSI_RESET + "\n1) ");
		//Case 1
		LocalDateTime now = LocalDateTime.now();
		String nativ = now.format(format());
		System.out.println(nativ);
		//Case 2
		System.out.print("2) ");
		String zone = "Europe/Berlin";
		LocalDateTime berlin = LocalDateTime.of(2002, Month.JANUARY, 1, 23, 55); 
		System.out.print("Berlin time - " + berlin);
		LocalDateTime msc = toMoscowTime(berlin, zone);
		System.out.println(", Moscow time - " + msc);
		//Case 3
		System.out.print("3) ");
		Instant inst = Instant.now();
		Date tmpConv = instantToDate(inst);
		Instant tmpInst = tmpConv.toInstant();
		LocalDateTime convert = LocalDateTime.ofInstant(tmpInst, ZoneId.systemDefault());
		System.out.println("In Instant - " + inst + ", in Data - " + convert);
		//Case 4
		System.out.print("4) ");
		WorkingTime mon = new WorkingTime(LocalTime.of(9, 0), LocalTime.of(20, 0));
		WorkingTime tue = new WorkingTime(LocalTime.of(9, 0), LocalTime.of(20, 0));
		WorkingTime wed = new WorkingTime(LocalTime.of(9, 0), LocalTime.of(20, 0));
		WorkingTime fri = new WorkingTime(LocalTime.of(9, 0), LocalTime.of(20, 0));
		WorkingTime sat = new WorkingTime(LocalTime.of(10, 0), LocalTime.of(19, 0));
		Map<DayOfWeek, WorkingDayTime> workWeek = new HashMap<>();
		workWeek.put(DayOfWeek.MONDAY, mon);
		workWeek.put(DayOfWeek.TUESDAY, tue);
		workWeek.put(DayOfWeek.WEDNESDAY, wed);
		workWeek.put(DayOfWeek.FRIDAY, fri);
		workWeek.put(DayOfWeek.SATURDAY, sat);
		System.out.println(getOperationTime(workWeek));
		//BLOCK 10
		System.out.println(ANSI_BLOCK + "BLOCK 10" + ANSI_RESET);
		//Case 1
		System.out.print("1) ");
		List<Worker> workers1 = new LinkedList<>();
		workers1.add(new WorkerImpl("Bob"));
		workers1.add(new WorkerImpl("Jhon"));
		workers1.add(new WorkerImpl("Bibop"));
		List<Worker> workers2 = new LinkedList<>();
		workers2.add(new WorkerImpl("Johua"));
		workers2.add(new WorkerImpl("Mike"));
		workers2.add(new WorkerImpl("Tailer"));
		workers2.add(new WorkerImpl("Jeka"));
		workers2.add(new WorkerImpl("Slayer"));
		workers2.add(new WorkerImpl("Pit"));
		workers2.add(new WorkerImpl("Jeka"));
		workers2.add(new WorkerImpl("Slack"));
		List<Worker> workers3 = new LinkedList<>();
		workers3.add(new WorkerImpl("Ivan"));
		workers3.add(new WorkerImpl("Obivan"));
		workers3.add(new WorkerImpl("Oduvan"));
		workers3.add(new WorkerImpl("Void"));
		Organization org1 = new OrganizationImp(workers1);
		Organization org2 = new OrganizationImp(workers2);
		Organization org3 = new OrganizationImp(workers3);
		Stream<Organization> organization = Stream.of(org1, org2, org3);
		Stream<String> uniqueWorkers = uniqueNameStream(organization);
		uniqueWorkers.forEach(uniqWrk -> System.out.print(uniqWrk +" "));
		System.out.print('\n');
		//Case 2
		System.out.print("2) ");
		Stream<OrganizationId> orgId = Stream.of(new OrganizationIdImpl(1), new OrganizationIdImpl(2),
				new OrganizationIdImpl(3), new OrganizationIdImpl(4));
		Map<Integer, OrganizationId> actual = orgId.collect(Collectors.toMap(OrganizationId::getId, Function.identity()));
		System.out.println(actual);
		//Case 3
		System.out.print("3) ");
		Stream<Worker2> workers = Stream.of(new Worker2Impl("Mikhael", 8), new Worker2Impl("Jack", 3), new Worker2Impl("Boris", 15),
				new Worker2Impl("Nik", 1568));
		String actual2 = workers.sorted( (o1, o2) -> {
				Integer isOne = o2.getPoints();
				Integer isTwo = o1.getPoints();
				return isOne.compareTo(isTwo); 
				} ).limit(3).map(p -> p.getName().toString()).collect(Collectors.joining(", ")).toString();
		System.out.println(actual2);
		//Case 4
		System.out.print("4) ");
		Stream<Worker3> workers4 = Stream.of(new Worker3Impl("Cook"), new Worker3Impl("Doctor"), new Worker3Impl("Mafia"),
				new Worker3Impl("Cook"), new Worker3Impl("Developer"), new Worker3Impl("Sherif"), new Worker3Impl("Sherif"));
		Map<String, List<Worker3>> actualMap = workers4.collect(Collectors.groupingBy(Worker3::getPosition));
		for (Entry e: actualMap.entrySet()) 
			System.out.println(e);
		//Case 5
		System.out.print("5) ");
		Stream<Worker3> workers5 = Stream.of(new Worker3Impl("Cook"), new Worker3Impl("Doctor"), new Worker3Impl("Mafia"),
				new Worker3Impl("Cook"), new Worker3Impl("Developer"), new Worker3Impl("Sherif"), new Worker3Impl("Sherif"));
		Map<String, Long> actualMap2 = workers5.collect(Collectors.groupingBy(Worker3::getPosition, Collectors.counting()));
		for (Entry e: actualMap2.entrySet()) 
			System.out.println(e);
		//Case 6
		System.out.print("6) ");
		Stream<Worker4> workers6 = Stream.of(new Worker4Impl("Cook", 14.2), new Worker4Impl("Doctor", 20.5), new Worker4Impl("Mafia", 1488),
				new Worker4Impl("Cook", 27), new Worker4Impl("Developer", 2), new Worker4Impl("Sherif", 24.562), new Worker4Impl("Sherif", 12.12));
		Map<String, Double> actualMap3 = workers6.collect(Collectors.groupingBy(Worker4::getPosition, 
				Collectors.averagingDouble(Worker4::getSalary)));
		for (Entry e: actualMap3.entrySet()) 
			System.out.println(e);
		//BLOCK 11
		System.out.println(ANSI_BLOCK + "BLOCK 11" + ANSI_RESET);
		//Case 1
		System.out.print("1) Threads 3 - ");
		Thread th1 = new Thread() {
			@Override
			public void run() {
					for (int i=0; i<10000; i++) {
						safeIncrement();
					}
			}
		};
		Thread th2 = new Thread() {
			@Override
			public void run() {
				for (int i=0; i<10000; i++) {
					safeIncrement();
				}
			}
		};
		Thread th3 = new Thread() {
			@Override
			public void run() {
				for (int i=0; i<10000; i++) {
					safeIncrement();
				}
			}
		};
		th1.start();
		th2.start();
		th3.start();
		th1.join();
		th2.join();
		th3.join();
		System.out.println(count);
		//Case 2
		System.out.print("2) Threads 4 - ");
		Thread th11 = new Thread() {
			@Override
			public void run() {
					for (int i=0; i<10000; i++) {
						safeIncrement1();
					}
			}
		};
		Thread th21 = new Thread() {
			@Override
			public void run() {
				for (int i=0; i<10000; i++) {
					safeIncrement1();
				}
			}
		};
		Thread th31 = new Thread() {
			@Override
			public void run() {
				for (int i=0; i<10000; i++) {
					safeIncrement1();
				}
			}
		};
		Thread th41 = new Thread() {
			@Override
			public void run() {
				for (int i=0; i<10000; i++) {
					safeIncrement1();
				}
			}
		};
		th11.start();
		th21.start();
		th31.start();
		th41.start();
		th11.join();
		th21.join();
		th31.join();
		th41.join();
		
		System.out.println(count1);
		//Case 3
		System.out.print("3) ");
		Thread method1 = new Thread() {
			@Override
			public void run() {
					method1();
			}
		};
		Thread method2 = new Thread() {
			@Override
			public void run() {
				method2();
			}
		};
		
		Thread orPoint = new Thread() {
			@Override
			public void run() {
				try {
					for (int i =0; i<3 ; i++) {
						System.out.print("\u001B[33m." + ANSI_RESET);
						sleep(333);
					}
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		};
		orPoint.start();
		method1.start();
		method2.start();
		
		Thread.sleep(1000);
		if (method1.isAlive() && method2.isAlive()) {
			System.out.print("\nAfter 1.0 second: lockA locked, lockB locked\n");
			count2.set(3);
		}
		//BLOCK 12
		System.out.println(ANSI_BLOCK + "BLOCK 12" + ANSI_RESET);
		//Case 1
		System.out.print("1) ");
	    A firstA = new A(3, "Brock", false);
	    printAllClassFields(firstA.getClass());
	    //Case 2
	    System.out.print("\n2) "); 
	    callMethodByName(firstA, "sayHello");
	    //Case 2.1
	    System.out.print("2.1) "); 
	    try {
	    callMethodWithHandler(firstA);
	    } catch (NoSuchMethodException | IllegalAccessException e) {
	    	e.printStackTrace();
	    }
	    //BLOCK 13
	    System.out.println(ANSI_BLOCK + "BLOCK 13" + ANSI_RESET);
	    //Case 1
	    System.out.print("1) ");
	    B theB = new B();
	    callMethodByWeight(theB);
	    //Case 2
	    System.out.print("2) ");
	    Base theC = new C();
	    Base proxyC = createProxy(theC);
	    proxyC.method1();
	    proxyC.method2();
	    //BLOCK 14
	    System.out.println(ANSI_BLOCK + "BLOCK 14" + ANSI_RESET);
	    //Case 1
	    System.out.print("1) ");
	    List<Object> wired = Stream.of(new E(), new D(), new F()).collect(Collectors.toList());
	    try {
	    	dependencyInjection(wired);
	    	System.out.println("good");
	    } catch (CandidateNotFindException e) {
	    	e.printStackTrace();
	    }
	    wired.add(new G());
	    try {
	    	dependencyInjection(wired);
	    	System.out.println("good");
	    } catch (CandidateNotFindException e) {
	    	System.out.println("1.1) "+ ANSI_RED +"CandidateNotFindException"+ ANSI_RESET);
	    }
	    //Case 2
	    System.out.print("2) ");
	    List<Object> callMapped = Stream.of(new H(), new I()).collect(Collectors.toList());
	    Map<String, Operation> mapRes =  createPoolOperation(callMapped);
	    for (Map.Entry<String, Operation> entry: mapRes.entrySet()) {
	    	entry.getValue().call();
	    }
	    System.out.println(ANSI_BLOCK + "---------------------------------------"
	    		+ "\nSTEPICK. Preparing for a java interview" + ANSI_RESET);
	}
	
	//BLOCK 1
	//Case 1
	static boolean checkPalindrom(String s){
		char n[]=s.toCharArray();
		int newLen=0;
		char temp[];
		
		for (int i=0; i<n.length; i++) {
			if (Character.isLetter(n[i]) || Character.isDigit(n[i])) 
				n[newLen++]= Character.toLowerCase(n[i]);
		}

		temp=new char[newLen];
		System.arraycopy(n, 0, temp, 0, newLen);

		char tab[]=new char[newLen];
		for (int i=newLen-1, j=0; i>=0; i--, j++) {
			tab[j]=temp[i];
		}

		
		if (Arrays.equals(temp, tab)) {
			return true;
		}
		return false;
	}
	
	//Case 2
	static void printFibonacci(long n){
		long a=0;
		long b=1;
		long c=1;
		for (int i=0; i<n-1; i++) {
			c=a+b;
			a=b;
			b=c;
		}
		if (n==0)
			c=0;
		System.out.print(c+ ". ");
	}

	//Case 3
	static void calculateAndPrint(int n) {
		int k=n/100;
		
	    if (k%2==0)
	    	n+=100;
	    else
	    	n*=2;
	    System.out.print(n+ " ");
	}
	
	//Case 4
	static void checkSortArrayLength(int[] array){
		int maxCount=1;
		int pretendMax=1;
		
		if (array.length!=1 && array.length!=0) {
			int prev=array[0];
			for (int i=0; i<array.length; i++) {
				if (array[i]>=prev && i!=0) {
					pretendMax++;
					prev=array[i];
					//System.out.println("PretendMax "+ pretendMax +" Array "+array[i]+ " And i "+ i);
					if (i==array.length-1 && pretendMax>maxCount)
						maxCount=pretendMax;
					continue;
				}
				if (pretendMax>maxCount) {
					maxCount=pretendMax;
				}
				prev=array[i];
				pretendMax=1;
			}
		}
		System.out.print(maxCount+ ". ");
	}
	
	//Case 5
	static NodeImpl reverse(NodeImpl head){
	   if (head==null)
		   return null;
	   NodeImpl temp=head;
	   NodeImpl result=null;
	   int count=0;
	   for (; temp!=null; temp=(NodeImpl)temp.getNext()) {
		   if (temp.getNext()==null)
			   result=new NodeImpl(temp.value);	 
		   count++;
	   }
	   
	   for (int i=count-1; i>0; i--) {
		   temp=head;
		   for (int j=0; j<i-1; j++) {
			   temp=(NodeImpl)temp.getNext();
		   }
           result.setNext(new NodeImpl(temp.value));
	   }
	   return result;
	}
	
	//Case 6
	static Node2 merge(Node2 head1, Node2 head2){
		Node2 result;
		
		if (head1.getData()<=head2.getData()) {
			result=head1;
			head1=head1.getNext();
		} else {
			result=head2;
			head2=head2.getNext();
		}
		Node2 trueResult=result;
		
		while (head1!=null && head2!=null) {
			if (head1.getData()<=head2.getData()) {
				result.setNext(head1);
				head1=head1.getNext();
			} else {
				result.setNext(head2);
				head2=head2.getNext();
			}
			result=result.getNext();		
		}
		
		if (head2==null) {
			
			while(head1!=null) {
				result.setNext(head1);
				head1=head1.getNext();
				result=result.getNext();
			}
		} else if (head1==null) {
			
			while(head2!=null) {
				result.setNext(head2);
				head2=head2.getNext();
				result=result.getNext();
			}	
		}
			
	    return trueResult;
	}
	
	//Case 7
	static int treeDepth(Tree root) {
		if (root!=null)
			return 1+ Math.max(treeDepth(root.getLeft()),treeDepth(root.getRight()));
		else
			return 0;
		}	
		
	// Case 8
	static int treeLeafCount(Tree root) {
		int count=0;
		if (root==null)
			return 0;
		else if (root.getLeft()!=null || root.getRight()!=null) {
			return treeLeafCount(root.getLeft()) +
			treeLeafCount(root.getRight());
		}
		else 
			return 1+count;
			
	}
	
	//BLOCK 2
	//Case 1
	static void checkFruitCount(Object[] objects) {
		int bananaCount = 0;
		int appleCount = 0;
		for (int i=0; i<objects.length; i++) {
			if (objects[i] instanceof Apple && objects[i] instanceof Banana) {
				appleCount++;
				bananaCount++;
			}
			else if (objects[i] instanceof Apple)
				appleCount++;
			else if (objects[i] instanceof Banana)
				bananaCount++;
		}
		System.out.println("banana="+bananaCount+", apple="+appleCount);
	}

	//BLOCK 3
	//Case 1
	static int reverseDigit(int n) {
		int temp=n%10;
		while ((n /= 10) > 0) {
			temp*=10;
			temp+=n%10;
		}
		return temp;
	}

	//Case 2
	static int reverseByte(int n) {
		
		int tmp = n;
		//tmp = ((tmp & 0x55555555) << 1) | ((tmp >> 1) & 0x55555555);  Меняем соседние биты байта местами  ..0101
	    //tmp = ((tmp & 0x33333333) << 2) | ((tmp >> 2) & 0x33333333); Меняем местами соседние пары бит   ..0011
	    //tmp = ((tmp & 0xF0F0F0F) << 4) | ((tmp >> 4) & 0xF0F0F0F);  Меняем местами соседние четверки бит ..0000 1111
	    tmp = ((tmp & 0xFF00FF) << 8) | ((tmp >> 8) & 0xFF00FF); // Меняем местами соседние байты ...0000 0000 1111 1111
	    tmp = ((tmp & 0xFFFF) << 16) | ((tmp >> 16) & 0xFFFF); // Меняем местами соседние пары байт ... 0000 0000 0000 0000 1111 1111 1111 1111
	    return tmp;
	}

	//BLOCK 4
	//Case 1
	static int calculate(String mathString) {
		mathString=convert(mathString);
		Stack<Integer> op = new Stack<Integer>();
		String tmpDigit;
		Integer tmpOp;
		Integer result=0;
		char s[] = mathString.toCharArray();
		for (int i=0; i<s.length; i++) {
			if (s[i]==' ') {
				continue;
			}
			else if(Character.isDigit(s[i])) {
				tmpDigit="";
				while(Character.isDigit(s[i])) {
					tmpDigit=tmpDigit.concat(""+s[i++]);
				}
				i--;
				op.push(Integer.parseInt(tmpDigit));
			}
			else if(s[i]=='+') {
				op.push(op.pop() + op.pop());
			}
			else if(s[i]=='-') {
				tmpOp=op.pop();
				op.push(-1*tmpOp);
			}
			else if(s[i]=='*') {
				op.push(op.pop() * op.pop());
			}
			else if(s[i]=='/') {
				tmpOp=op.pop();
				if (tmpOp!=0.0) {
					op.push(op.pop()/tmpOp);
				}
			}
		}
		Integer op2=0;
		Integer op3=0;
		while (!op.isEmpty()) {
			op2=op.pop();
			if (!op.isEmpty())
				op3=op.pop();
			result=op2+op3;
		}
		return result;
	}
	
	public static String convert(String expression) {
		expression=expression.concat(" ");
        StringBuilder sb = new StringBuilder();
 
        Stack<Character> op = new Stack<Character>();
 
        char[] chars = expression.toCharArray();

        int N = chars.length;
 
        for (int i = 0; i < N; i++) {
            char ch = chars[i];
 
            if (Character.isDigit(ch)) {
                while (Character.isDigit(chars[i])) {
                    sb.append(chars[i++]);
                }
                i--; // Если в выражении нет пробелов
                sb.append(' ');
            } else if (ch == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    sb.append(op.pop()).append(' ');
                }
                op.pop();
            } else if (isOperator(ch)) {
                while (!op.isEmpty() && priority(op.peek()) >= priority(ch)) {
                    sb.append(op.pop()).append(' ');
                }
                op.push(ch);
            }
        }
        while(!op.isEmpty()) {
            sb.append(op.pop()).append(' ');
        }
        System.out.print("[Convert to postfix "+ sb.toString()+"] = ");
        return sb.toString();
    }
	
	private static boolean isOperator(char ch) {
	        return ch == '^' || ch == '*' || ch == '/' || ch == '+' || ch == '-';
	 }
	 
	private static int priority(char operator) {
	        switch (operator) {
	            case '^' : return 3;
	            case '*' :
	            case '/' : return 2;
	            case '+' :
	            case '-' : return 1;
	        }
	        return 0;
	 }
	 
	 //Case 2
	 //In class MyBigNumber
	 
	 //Case 3
	 static private void findAllUrl(String text) {
		 String regex = "(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([#?=&\\/\\w\\.-]*)*\\/?";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(text);
		 while (matcher.find()) {
		        System.out.println(text.substring(matcher.start(), matcher.end()));
		 }
		 
	 }

	 //BLOCK 5
	 //Case 1
	 static public Complex createComplex(double real, double image) {
		    return new ComplexDigit(real, image);
	}

	 //BLOCK 6
	 //Case 1
	 static public void generateStackOverflowError(){
		 String a="Same on same";
		 String b="Get";
		 String c="Overflow";
		 if (!a.substring(1).equals(b) && c!="Look forward") {
			 c="Same as me";
			 generateStackOverflowError();	
		 }	    
	 }
	 
	 //Case 2
	 static void generateOutOfMemoryError() {
		 LinkedList<Object> holder = new LinkedList<Object>();
		    for (int i=1; i>0; i++) {
		    	holder.add(new byte[128 * 1024]);
		    }
		}

	 //Case 3
	 static List<Integer> generateBadList() {
		    List<Object> list = new ArrayList<Object>();
		    for (int i=0; i<12; i++) {
		    		Integer tmp = i;
		    		list.add(tmp);
		    }
    		list.set(6, '3');
    		List<Integer> result = (List) list;
		    return  result;
	   }
	 
	 static int badListSum(List<Integer> n) {
		 Integer result = 0;
		 for (int i=0; i<n.size(); i++) {
			 Integer number = n.get(i); 
			 result+=number;
		 }
		 return result;
	  }

	 //Case 4
	 static void genConcurrentModificationException(List<Integer> integers) {
		 int dontLikeThisElement=0;
		 for (Integer x: integers) {
			 dontLikeThisElement++;
			 if (dontLikeThisElement==3)
				 integers.remove(x);
		 }
	 }

	 //BLOCK 7
	 //Case 1
	 static Box<Integer> boxingValue(double value) {
		 Double v = value;
		 Box<? super Number> a = new Box<>(v);
		 return (Box) a;
	 }

	 //Case 2
	 //In abstract class Factory
	 
	 //BLOCK 8
	 //Case 1
	 //In class FibonacciIterator and FibonacciIterable
	 
	 //Case 2
	 //In class Tree.TreeIterator
	 
	 //Case 3
	 static void setParents(List<Tree> nodes) {
		 for (Tree x: nodes) {
			 if (x.getLeft()!=null) 
				 parentsCheck(x, x.getLeft(), nodes);
			 if (x.getRight()!=null) 
				 parentsCheck(x, x.getRight(), nodes);
		 }
	 }
	 
	 static private void parentsCheck(Tree x, Tree y, List<Tree> nodes) {
		for (Tree z: nodes) {
			if (y==z) {
				y.setParent(x);
				System.out.print("Parent "+y.getValue()+" is a "+x.getValue()+". ");
			}
		}
	 }

	 //BLOCK 9
	 //Case 1 
	 static DateTimeFormatter format() {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-'M'M-'W'W-E:H:m").withLocale(Locale.UK);
		 return formatter;
	 }

	 //Case 2
	 static LocalDateTime toMoscowTime(LocalDateTime localDateTime, String zoneName) {
		 	ZoneId inZoneId = ZoneId.of(zoneName);
		 	ZoneId moscowZoneId = ZoneId.of("Europe/Moscow");
		 	ZonedDateTime inZonedDateTime = localDateTime.atZone(inZoneId);
		 	ZonedDateTime moscowDateTime = inZonedDateTime.withZoneSameInstant(moscowZoneId);
		 	LocalDateTime moscow = moscowDateTime.toLocalDateTime();
		    return moscow;
		}

	 //Case 3
	 static Date instantToDate(Instant instant) {
		    Instant iT = instant.truncatedTo( ChronoUnit.MILLIS );
		    Date aa = new Date(Long.MAX_VALUE);
		    Date bb = new Date(Long.MIN_VALUE);
		    Instant a = aa.toInstant();
		    Instant b = bb.toInstant();
		    if (iT.compareTo(a)==1)
		    	return new Date(Long.MAX_VALUE);
		    else if (iT.compareTo(b)==-1)
		    	return new Date(Long.MIN_VALUE);
		    
		    Date convert = Date.from(iT);

		    return convert;
		}
	 
	 //Case 4
	 static String getOperationTime(Map<DayOfWeek, WorkingDayTime> dayTimeMap) {
		    StringBuilder sb = new StringBuilder();
		    String[] arrOfDays = {"пн", "вт", "ср", "чт", "пт", "сб", "вс"};
		    int prevDay=0;
		    boolean flag = false;
		    boolean weekEndFlag = false;
		    WorkingDayTime prevWT = null;
		    WorkingDayTime currWT = null;
		    DayOfWeek[] days = DayOfWeek.values();
		    for (int i=0; i<days.length; i++) {
		    	if (dayTimeMap.containsKey(days[i])) {
		    		if (weekEndFlag) {
		    			sb.append(" выходной, ");
		    			weekEndFlag=false;
		    		}
		    		if (!flag) {
		    			sb.append(arrOfDays[days[i].getValue()-1]);
		    			flag = true;
		    			prevDay = days[i].getValue();
		    			prevWT = dayTimeMap.get(days[i]);
		    		}
		    		else {
		    			currWT = dayTimeMap.get(days[i]);
		    			if ( !(prevWT.getStart().compareTo(currWT.getStart())==0 && prevWT.getEnd().compareTo(currWT.getEnd())==0 ) ) {
		    				sb.append(" ").append(dayTimeMap.get(days[prevDay-1]).getStart())
		    				.append("-").append(dayTimeMap.get(days[prevDay-1]).getEnd()).append(", ");
		    				
		    				sb.append(arrOfDays[days[i].getValue()-1]).append(" ").append(dayTimeMap.get(days[i]).getStart())
		    				.append("-").append(dayTimeMap.get(days[i]).getEnd()).append(", ");	
		    				flag = false;
		    			}
		    			prevDay = days[i].getValue();
		    			if (i==days.length-1) {
		    				sb.append("-").append(arrOfDays[days[prevDay-1].getValue()-1]+ " ").append(dayTimeMap.get(days[prevDay-1]).getStart())
			    			.append("-").append(dayTimeMap.get(days[prevDay-1]).getEnd()).append(", ");
		    			}
		    		}
		    	} else {
		    		
		    		if (flag) {
		    			sb.append("-").append(arrOfDays[days[prevDay-1].getValue()-1]+ " ").append(dayTimeMap.get(days[prevDay-1]).getStart())
		    			.append("-").append(dayTimeMap.get(days[prevDay-1]).getEnd()).append(", ");
		    			flag = false;
		    		}
		    		if (weekEndFlag) 
		    			sb.append(", ").append(arrOfDays[days[i].getValue()-1]);
		    		else
		    			sb.append(arrOfDays[days[i].getValue()-1]);
		    		weekEndFlag = true;
		    		if (i==days.length-1)
		    			sb.append(" выходной, ");
		    	}
		    }
		    sb.delete(sb.length()-2, sb.length()-1);
		    
		    return sb.toString();
		}

	 //BLOCK 10
	 //Case 1
	 static Stream<String> uniqueNameStream(Stream<Organization> organizationStream) {
		 Stream<Organization> moreThanSevenWorkers = organizationStream.filter(s -> s.getWorkers().stream().count() > 7);
		 Stream<Worker> workers = moreThanSevenWorkers.flatMap(p -> p.getWorkers().stream());
		 Stream<String> ls = workers.map(p -> p.getName()).collect(Collectors.toList()).stream();
		 Stream<String> result = ls.distinct();
		 /*
		 Stream<String> result = organizationStream.filter(s -> s.getWorkers().stream().count() > 7).flatMap(p -> p.getWorkers().stream())
		 .map(p -> p.getName()).collect(Collectors.toList()).stream().distinct();  */
		 return result;
		 /*
		  Optimazed solution
		  return organizationStream
        .map(Organization::getWorkers)
        .filter(workers -> workers.size() > 7)
        .flatMap(List::stream)
        .map(Worker::getName)
        .distinct();
		  */
	}

	 //Case 2
	 // Solution in line 305 Map<Integer, OrganizationId> actual = orgId.collect(Collectors.toMap(OrganizationId::getId, Function.identity()));
	 
	 //Case 3
	// Solution in lines 311-315 
	/*
	  String actual2 = workers.sorted( (o1, o2) -> {
				Integer isOne = o2.getPoints();
				Integer isTwo = o1.getPoints();
				return isOne.compareTo(isTwo); 
				} ).limit(3).map(p -> p.getName().toString()).collect(Collectors.joining(", ")).toString();
	Optimal
	  String actual = workers
    	.stream()
    	.sorted((w1, w2) -> w2.getPoints() - w1.getPoints())
    	.limit(3)
    	.map(Worker::getName)
    	.collect(Collectors.joining(", "));
	*/
	 
	 //Case 4
	 // Solution in line 321 Map<String, List<Worker3>> actualMap = workers4.collect(Collectors.groupingBy(Worker3::getPosition));

	 //Case 5
	 // Solution in line 328 Map<String, Long> actualMap2 = workers5.collect(Collectors.groupingBy(Worker3::getPosition, Collectors.counting()));
	 
	 //Case 6
	 // Solution in lines 335-336 Map<String, Double> actualMap3 = workers6.collect(Collectors.groupingBy(Worker4::getPosition, 
	 //	Collectors.averagingDouble(Worker4::getSalary)));

	 //BLOCK 11
	 //Case 1
	 static volatile int count = 0;
	 static ReentrantLock lock = new ReentrantLock();
	 static void safeIncrement() {
		 	try {
		 		lock.lock();
		 		count++;
		 	} finally {
		 		lock.unlock();
		 	}
		}

	 //Case 2
	 static volatile int count1 = 0;
	 static private AtomicBoolean atomicBoolean = new AtomicBoolean(false);
	 static void safeIncrement1() {
		 	while (true) {
		 		if (atomicBoolean.compareAndSet(false, true)) {
		 			count1++;
		 			atomicBoolean.set(false);
		 			return;
		 		}	 
		 	}	    
	}

	 //Case 3
	 static ReentrantLock lockA = new ReentrantLock();
	 static ReentrantLock lockB = new ReentrantLock();

	 static AtomicInteger count2 = new AtomicInteger(2);
	 
	 static void method1() {
		 lockA.lock();
		 lockB.lock();
		 job1();
		 lockB.unlock();
		 while(lockA.isLocked()) {
			 if (count2.get()==3) {
				 lockA.unlock();
				 return;
			 }
				 
		 } 
	}

	 static void method2()  {
		 lockB.lock();
		 lockA.lock();
		 job1();
		 lockA.unlock();
		 while(lockB.isLocked()) {
			 if (count2.get()==3) {
				 lockB.unlock();
				 return;
			 } 
		 }	
	}
	 
	 static List<Integer> jobs = Stream.of(3, 4, 7, 12).collect(Collectors.toList());
	
	 static void job1() {
		 String job1 = jobs.stream().toString();
	}
	 
	 static void job2() {
		 String job2 = jobs.stream().toString().replaceAll("3", "11");
	}

	 /*Alternative solution
	  
	 void method1() {
        lockA.lock();
        count.decrementAndGet();
        while (count.get() > 0);
        lockB.lock();
        job1();
        lockA.unlock();
        lockB.unlock();
    }

    void method2() {
        lockB.lock();
        count.decrementAndGet();
        while (count.get()>0);
        lockA.lock();
        job2();
        lockB.unlock();
        lockA.unlock();
    }
	*/
	//BLOCK 12
	//Case 1
	static <T> void printAllClassFields(Class<T> aClass) {
		Field[] fields = aClass.getDeclaredFields();
		Stream<Field> f = Stream.of(fields);
		f.map(Field::getName).sorted().forEach(s -> System.out.print(s + " "));
		}

	//Case 2
	static void callMethodByName(Object object, String methodName, Object... params) throws Exception {
	    Method[] m = object.getClass().getMethods();
	    for (Method x: m) {
	    	if (x.getName().equals(methodName)) {
	    		x.invoke(object, params);
	    	}
	    }
	    /*
	    Stream<Method> methods = Stream.of(m);
	    methods.filter(s -> s.getName().equals(methodName)).forEach(s -> {
			try {
				s.invoke(object, params);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		});*/
	}

	//Case 2.1
	static void callMethodWithHandler(Object object) throws NoSuchMethodException, IllegalAccessException {
		MethodHandles.Lookup publicLookup = MethodHandles.publicLookup();
	    MethodType mt = MethodType.methodType(String.class);
	    MethodHandle sayMH = publicLookup.findVirtual(object.getClass(), "sayHello2", mt);
	    try {
	    	System.out.print("With MethodHandler - ");
	    	Object output = (String) sayMH.invoke(object);
	    	System.out.println(output);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	//BLOCK 13
	//Case 1
	static void callMethodByWeight(Object object) throws Exception {
		
		Method[] m = Arrays.stream(object.getClass().getDeclaredMethods()).filter(s -> {
			Annotation[] anno = s.getAnnotations();
			for (Annotation a: anno) {
				if (a.annotationType().equals(Weight.class))
					return true;
			}
			return false;
		}).sorted( (o1, o2) -> o1.getAnnotation(Weight.class).value()-(o2.getAnnotation(Weight.class).value())).toArray(Method[]::new);
	    for (Method x: m) {
	    	x.setAccessible(true);
	    	x.invoke(object);
	    }
	    /*
	    Arrays.stream(object.getClass().getDeclaredMethods()).filter(s -> 
		Arrays.stream(s.getAnnotations()).filter(p -> p.annotationType().equals(Weight.class)).count()>0 )
				.sorted( (o1, o2) -> o1.getAnnotation(Weight.class).value()-(o2.getAnnotation(Weight.class).value())).forEach(k -> {
					k.setAccessible(true);
					try {
						k.invoke(object);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
				}); */
	}

    //Case 2
	static Base createProxy(Base object) throws Exception {
		
		InvocationHandler handler = (proxy, method, args) -> {
			
		    if(Arrays.stream(object.getClass().getDeclaredMethod(method.getName()).getAnnotations())
		    		.filter(s -> s.annotationType().equals(Logging.class)).count()>0){
		        System.out.println("Before call "+ method.getName());
		    	method.invoke(object, args);
		    	System.out.println("After call "+ method.getName());
		    	return null;
		    } 
		    method.invoke(object, args);
		    return null;
		}; 
		
		return (Base) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), handler);
	}

	//BLOCK 14
	//Case 1
	static void dependencyInjection(List<Object> objects) throws Exception {
		boolean flag;
	    for(Object o: objects) {
	    	flag = false;
	    	Field[] f =  Stream.of(o.getClass().getDeclaredFields()).toArray(Field[]::new);
	    	for (Field x: f) {
	    		if(x.getAnnotation(Autowired.class)!=null) {
	    			for (Object o2: objects) {
	    				if (x.getType().equals(o2.getClass())) {
	    					Method set = o.getClass().getMethod("set"+x.getName().toUpperCase(), o2.getClass()); 
	    					set.invoke(o, o2);
	    					flag = true;
	    				}
	    			}
	    			if (!flag) 
	    				throw new CandidateNotFindException();				
	    		}
	    	} 
	   }
	}    

	//Case 2
	static Map<String, Operation> createPoolOperation(List<Object> objects) throws Exception {
	    Map<String, Operation> res = new HashMap<>();
	    for (Object o: objects) {
	    	Method[] m = Arrays.stream(o.getClass().getDeclaredMethods()).filter(s -> 
	    		Arrays.stream(s.getAnnotations()).filter(p -> p.annotationType().equals(BotRequestMapping.class)).count()>0).toArray(Method[]::new);
	    	for (Method x: m) {
	    		res.put(x.getAnnotation(BotRequestMapping.class).value(), () ->  { x.setAccessible(true);
	    		x.invoke(o); });
	    	}
	    }
	    return res;
	}

}
