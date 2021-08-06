## Thread(İş Parçacığı)
İş parçacığı, bilgisayar biliminde, bir işin eş zamanlı olarak işlenen her bir bölümüdür. 
İş parçacığı ve işlem arasındaki fark bir işletim sisteminden diğerine değişmekle birlikte genel olarak iş parçacığının oluşturuluşu ve kaynakların paylaşılmasıdır. 
İşlemler, birçok iş parçacığı oluşturup sonlandırabilir, iş parçacıkları da ortak hafıza kullanabilirler. Çoğu durumda iş parçacıkları işlemlerin içinde yer alır, onları oluştururlar.

## Multithreading
Programın çalışması tek bir process üzerinden sağlanırken, bu process üzerinde birden fazla işlem parçacığı çalışmaktadır. 
Process üzerinde çalışan bu çoklu işlem parçacıkları, asenkron olarak farklı görevleri yerine getirmek için kullanılırlar. 
Bu sayede birbirlerini beklemesi gerekmeyen işlemlerin, tek bir process üzerinde asenkron olarak gerçekleştirilmeleri sağlanır ve performans arttırılmış olur.

Çok iş parçacıklı ortamlarda, uygulamaları iş parçacığı güvenli bir şekilde yazmamız gerekir. 
Bu, farklı iş parçacıklarının hatalı davranış göstermeden veya öngörülemeyen sonuçlar üretmeden aynı kaynaklara erişebileceği anlamına gelir. 
Bu programlama metodolojisi "iş parçacığı güvenliği" olarak bilinir.

## Thread Safety
İş parçacığı güvenliği, çok iş parçacıklı koda uygulanabilen bir bilgisayar programlama konseptidir. 
İş parçacığı için güvenli kod, paylaşılan veri yapılarını yalnızca tüm iş parçacıklarının düzgün davranmasını ve tasarım özelliklerini istenmeyen etkileşim olmadan yerine getirmesini sağlayacak şekilde işler.

## Synchronized Methods
Aynı anda yalnızca bir iş parçacığı senkronize bir yönteme erişebilirken, bu yönteme diğer iş parçacıklarından erişimi engeller . 
İlk iş parçacığı bitene veya yöntem bir özel durum oluşturana kadar diğer iş parçacıkları engellenmiş olarak kalacaktır.
Senkronize yöntemler, "iç kilitler" veya "izleme kilitleri" kullanımına dayanır . İç kilit, belirli bir sınıf örneğiyle ilişkili örtük bir iç varlıktır.

Çok iş parçacıklı bir bağlamda, monitör terimi , belirli bir dizi yönteme veya ifadeye özel erişimi zorunlu kıldığından, kilidin ilişkili nesne üzerinde gerçekleştirdiği role bir referanstır.

Bir iş parçacığı senkronize bir yöntemi çağırdığında, içsel kilidi alır. İş parçacığı yöntemi yürütmeyi bitirdikten sonra kilidi serbest bırakır, böylece diğer iş parçacıklarının kilidi almasına ve yönteme erişmesine izin verir.

## Synchronized Avantajları
Synchronized anahtar sözcüğünü kullanmak, veri tutarsızlığı sorununu azaltır.

## Synchronized Dezavantajları
İş parçacığının bekleme süresini artırır. Bir seferde yalnızca bir iş parçacığı nesne üzerinde çalışabilir, bu nedenle diğer iş parçacıklarının beklemesi gerekir. 
Dolayısıyla performans sorunu yaratır.

## Referanslar
[Thread](https://tr.wikipedia.org/wiki/%C4%B0%C5%9F_par%C3%A7ac%C4%B1%C4%9F%C4%B1) <br/>
[Multithreading](https://thecodeprogram.com/multithreading-ve-multiprocessing-nedir--farklari-nelerdir-) <br/>
[Thread Safety - Synchronized](https://www.baeldung.com/java-thread-safety)  <br/>
[advantages-and-disadvantages](https://tutorials.webencyclop.com/tag/dvantage-and-disadvantage-of-synchronized-keyword-synchronization/)
