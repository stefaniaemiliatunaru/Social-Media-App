Clasa Utilizator cuprinde:
- Nume utilizator si parola
- Un vector de String-uri unde se stocheaza numele de utilizatorilor urmariti
- Numarul de persoane urmarite
- Un vector de String-uri unde se stocheaza numele utilizatorilor urmaritori
- Numarul de urmaritori
- Un vector de int-uri unde se stocheaza id-urile postarilor create
- Numarul postarilor create
- Un vector de int-uri unde se stocheaza id-urile comentariilor adaugate
- Numarul comentariilor adaugate
- Un vector de int-uri unde se stocheaza id-urile postarilor / comentariilor apreciate
- Numarul postarilor / comentariilor apreciate
- Numarul de aprecieri totale (comentarii + postari)
- Un getter pentru parola
- Un setter pentru parola


Clasa Postare curpinde:
- Id-ul initial al contorizarii postarilor
- Metoda resetGenerareId prin care se reseteaza id-ul curent la cel initial
- Id-ul postarii
- Continutul postarii de tip String
- Creatorul postarii ce este reprezentat de numele de utilizator
- Data postarii
- Un vector de String-uri unde se stocheaza numele de utilizator ai utilizatorilor ce au apreciat postarea
- Numarul utilizatorilor ce au apreciat postarea
- Un vector de int-uri unde se stocheaza id-urile comentariilor adaugate
- Numarul comentariilor adaugate
- Metoda utilizatorDaLike in care se actualizeaza vectorul ce contorizeaza media apreciat de utilizator si numarul de media apreciat. In aceasta metoda se actualizeaza si vectorul ce contorizeaza utilizatorii care au apreciat postarea si numarul acestora.
- Metoda Postare unde se genereaza cate un id diferit pentru fiecare postare prin incrementarea repetata al id-ului initial


Clasa Comentariu curpinde:
- Id-ul initial al contorizarii comentariilor
- Metoda resetGenerareId prin care se reseteaza id-ul curent la cel initial
- Id-ul comentariului
- Continutul comentariului de tip String
- Creatorul comentariului ce este reprezentat de numele de utilizator
- Data comentariului
- Un vector de String-uri unde se stocheaza numele de utilizator ai utilizatorilor ce au apreciat comentariul
- Numarul utilizatorilor ce au apreciat comentariul
- Metoda utilizatorDaLike in care se actualizeaza vectorul ce contorizeaza media apreciat de utilizator si numarul de media apreciat. In aceasta metoda se actualizeaza si vectorul ce contorizeaza utilizatorii care au apreciat comentariul si numarul acestora.
- Metoda Comentariu unde se genereaza cate un id diferit pentru fiecare comentariu prin incrementarea repetata al id-ului initial


Interfata Likeable curpinde:
- Metoda utilizatorDaLike


App.java cuprinde:
- Un ArrayList utilizatori care stocheaza toate obiectele de tip utilizator create
- Un ArrayList postari care stocheaza toate obiectele de tip postare create
- Un ArrayList idPostari care stocheaza toate id-urile postarilor create
- Un ArrayList comentarii care stocheaza toate obiectele de tip comentariu create
- Un ArrayList idComentarii care stocheaza toate id-urile comentariilor create
- Metoda scoateInfoDinParametru care primeste ca parametru un String. Metoda stocheaza in stringAuxiliar string-ul obtinut prin extragerea caracterelor cuprinse intre apostrofuri din parametru.
- Daca nu exista parametri se afiseaza textul prestabilit "Hello World!"

Creare utilizator
- Daca primul parametru intalnit este "-create-user" se incep verificarile necesari crearii unui nou utilizator
- Se verifica daca exista parametrul nume utilizator, iar in caz contrar se afiseaza eroarea corespunzatoare
- Daca numele de utilizator exista, se verifica daca exista parametrul parola, iar in caz contar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti toti parametrii necesari, se incepe procedura de creare a unui nou utilizator prin separarea numelui de utilizator si a parolei acestuia si retinerea lor prin intermediul metodei scoateInforDinParametru
- Se verifica daca exista deja un utilizator cu numele de utilizator cerut prin parcurgerea array-ului utilizatori, iar in caz afirmativ se afiseaza eroarea corespunzatoare
- In cazul in care nu exista un utilizator cu numele de utilizator cerut, se creeaza un obiect nou de tip Utilizator, i se seteaza numele de utilizator si parola, se adauga in array-ul de utilizatori se afiseaza mesajul de succes

Creare postare
- Daca primul parametru intalnit este "-create-post" se incep verificarile necesare crearii unei noi postari
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura de creare a unei noi postari prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul de text al postarii, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care este prezent parametrul de text al postarii, se extrage textul cu ajutorul metodei scoateInfoDinParametru in variabila textPostare
- Se verifica daca lungimea lui textPostare depaseste 300 de caractere, caz in care se afiseaza eroarea corespunzatoare
- Daca lungimea este sub 300 de caractere se creeaza un obiect nou de tip Postare, i se seteaza textul, autorul, se genereaza data postarii si se adauga noua postare in array-ul de postari. Se adauga id-ul postarii create in array-ul idPostari si in vectorul de postari al utilizatorului curent si se incrementeaza numarul de postari ale utilizatorului curent. Se afiseaza mesajul de succes.

Stergere postare
- Daca primul parametru intalnit este "-delete-post-by-id" se incep verificarile necesare stergerii unei postari
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura de stergere a unei postari prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul de id al postarii, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care este prezent parametrul de id al postarii, se extrage id-ul cu ajutorul metodei scoateInfoDinParametru in idPostare
- Se verifica daca postarea apartine utilizatorului cu numele de utilizator introdus ca parametru prin parcurgerea vectorului de postari, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Daca nu exista erori, se poate sterge postarea cu id-ul introdus. Se parcurge array-ul postari si se extrage postarea cu id-ul cerut, dupa care este eliminata din array-ul postari. Se actualizeaza array-ul idPostari si vectorul de postari create al utilizatorului curent prin eliminarea postarii cu id-ul introdus si se actualizeaza numarul de postari create ale utilizatorului curent. Se afiseaza mesajul de succes.

Follow utilizator
- Daca primul parametru intalnit este "-follow-user-by-username" se incep verificarile necesare urmaririi unui utilizator
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura de follow utilizator prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea acestora
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul nume de utilizator al utilizatorului care se doreste a fi urmarit, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Daca exista parametrul de nume de utilizator ce se doreste a fi urmarit, se extrage numele de utilizator prin folosirea metodei scoateInfoDinParametru in variabila followNumeUtilizator
- Se verifica daca followNumeUtilizator este valid prin parcurgerea array-ului utilizatori, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Se verifica daca utilizatorul curent urmareste deja utilizatorul followNumeUtilizator, iar in caz afirmativ se afiseaza mesajul de eroare corespunzator
- Daca nu este intampinata niciuna dintre erori, se poate urmari followNumeUtilizator. Se actualizeaza vectorul de utilizatori urmariti al utilizatorului curent si numarul de utilizatori urmariti al acestuia. Se actualizeaza vectorul de urmaritori ai utilizatorului followUtilizator si numarul de urmaritori ai acestuia. Se afiseaza mesajul de succes.

Unfollow utilizator
- Daca primul parametru intalnit este "-unfollow-user-by-username" se incep verificarile necesare incetarii urmaririi unui utilizator
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura de unfollow utilizator prin separarea numelui de utilizator care doreste sa dea unfollow unui utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul nume de utilizator al utilizatorului care se doreste a nu mai fi urmarit, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Daca exista parametrul de nume de utilizator ce se doreste a nu mai fi urmarit, se extrage numele de utilizator prin folosirea metodei scoateInfoDinParametru in variabila unfollowNumeUtilizator
- Se verifica daca unfollowNumeUtilizator este valid prin parcurgerea array-ului utilizatori, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Se verifica daca utilizatorul curent urmareste utilizatorul unfollowNumeUtilizator, iar in contrar afirmativ se afiseaza mesajul de eroare corespunzator
- Daca nu se intampina nicio eroare, se poate incepe procedura de unfollow utilizator, se actualizeaza vectorul de utilizatori urmariti al utilizatorului curent prin eliminarea lui unfollowNumeUtilizator si se actualizeaza numarul de persoane urmarite
- Se actualizeaza vectorul de urmaritori al lui unfollowUtilizator prin eliminarea utilizatorului curent si se actualizeaza numarul de urmaritori ai lui unfollowUtilizator
- Se afiseaza mesajul de succes

Like postare
- Daca primul parametru intalnit este "-like-post" se incep verificarile necesare aprecierii unei postari
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura de like postare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si se retin
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul id al postarii care se doreste a fi apreciata, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Daca exista parametrul id al postarii ce se doreste a fi apreciata, se extrage id-ul prin folosirea metodei scoateInfoDinParametru in variabila likeIdPostare
- Se verifica daca likeIdPostare este valid prin parcurgerea array-ului postari, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Se verifica daca utilizatorul curent a apreciat deja postarea cu id-ul introdus, iar in caz afirmativ se afiseaza mesajul de eroare corespunzator
- Se verifica daca utilizatorul ce doreste sa aprecieze postarea este chiar autorul acesteia, caz in care se afiseaza eroarea corespunzatoare
- Se foloseste metoda utilizatorDaLike pentru a se aprecia postarea si se afiseaza mesajul de succes

Unlike postare
- Daca primul parametru intalnit este "-unlike-post" se incep verificarile necesare incetarii aprecierii unei postari
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura de like unlike postare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea acestora
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul id al postarii care se doreste a nu mai fi apreciata, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Daca exista parametrul id al postarii ce se doreste a nu mai fi apreciata, se extrage id-ul prin folosirea metodei scoateInfoDinParametru in variabila unlikeIdPostare
- Se verifica daca unlikeIdPostare este valid prin parcurgerea array-ului postari, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Se verifica daca utilizatorul curent a apreciat postarea cu id-ul introdus, iar in cazul in care postarea nu e apreciata se afiseaza mesajul de eroare corespunzator
- Se actualizeaza vectorul de utilizatoriApreciatori al postarii lui unlikePostare, prin eliminarea utilizatorului curent, si se actualieaza numarul de utilizatori apreciatori ai acesteia
- Se actualieaza vectorul idMediaApreciat al utilizatorului curent, eliminandu-se postarea cu id-ul introdus, si se actualizeaza numarul de media apreciate ale utilizatorului curent
- Se afiseaza mesajul de succes

Like comentariu
- Daca primul parametru intalnit este "-like-comment" se incep verificarile necesare aprecierii unei postari
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura de like comentariu prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul id al comentariului care se doreste a fi apreciat, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Daca exista parametrul id al comentariului ce se doreste a fi apreciat, se extrage id-ul prin folosirea metodei scoateInfoDinParametru in variabila likeIdComentariu
- Se verifica daca likeIdComentariu este valid prin parcurgerea array-ului comentarii, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Se verifica daca utilizatorul curent a apreciat deja comentariul cu id-ul introdus, iar in caz afirmativ se afiseaza mesajul de eroare corespunzator
- Se verifica daca utilizatorul ce doreste sa aprecieze comentariul este chiar autorul acestuia, caz in care se afiseaza eroarea corespunzatoare
- Daca nu este intampinata nicio eroare, comentariul poate fi apreciat, se foloseste metoda utilizatorDaLike pentru a se aprecia comentariul si se afiseaza mesajul de succes

Unlike comentariu
- Daca primul parametru intalnit este "-unlike-comment" se incep verificarile necesare incetarii aprecierii unui comentariu
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura de incetare a aprecierii unui comentariu prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul id al comentariului care se doreste a nu mai fi apreciat, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Daca exista parametrul id al comentariului ce se doreste a nu mai fi apreciat, se extrage id-ul prin folosirea metodei scoateInfoDinParametru in variabila unlikeIdComentariu
- Se verifica daca unlikeIdComentariu este valid prin parcurgerea array-ului comentarii, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Se verifica daca utilizatorul curent apreciaza comentariul cu id-ul introdus, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Se actualizeaza vectorul de utilizatoriApreciatori al comentariului unlikeComentariu, prin eliminarea utilizatorului curent, si se actualieaza numarul de utilizatori apreciatori ai acestuia
- Se actualieaza vectorul idMediaApreciat al utilizatorului curent, eliminandu-se comentariul cu id-ul introdus, si se actualizeaza numarul de media apreciate ale utilizatorului curent
- Se afiseaza mesajul de succes

Postari utilizatori urmariti
- Daca primul parametru intalnit este "-get-followings-posts" se incep verificarile necesare afisarii
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura afisare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Daca nu este intampinata nicio eroare, se pot afisa postarile utilizatorilor urmariti, se sorteaza vectorul de id-uri in ordine descrescatoare, dupa care se parcurge vectorul de postari si verific care dintre autorii postarilor este urmarit de utilizatorul curent. Afisez postarile utilizatorilor urmariti conform cerintei.

Postarile unui utilizator
- Daca primul parametru intalnit este "-get-user-posts" se incep verificarile necesare afisarii
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura afisare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca parametrul nume de utilizator al utilizatorului ale carui postari ne dorim sa le afisam este dat, iar in caz contrar se afiseazaa mesajul de eroare corespunzator
- Se verifica daca numele de utilizator al utilizatorului ale caror postari dorim sa le afisam este valid, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Se verifica daca utilizatorul ale carui postari dorim sa le afisam il are in vectorul de urmaritori pe utilizatorul curent, iar in caz contarr se afiseaza emsajul de eroare corespunzator
- Se sorteaza descrescator vectorul de id-uri ale postarilor, dupa care se parcurge array-ul de postari si se verifica postarile care apartin utilizatorului dorit, dupa care se afiseaza corespunzator cerintei

Detalii postare
- Daca primul parametru intalnit este "-get-post-details" se incep verificarile necesare afisarii
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura afisare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca este introdus al treilea parametru, id-ul unei postari, apoi se verifica daca acest id este valid, afisandu-se mesajele de eroare corespunzatoare
- Se sorteaza descrescator dupa id array-ul idComentarii, dupa care se incepe afisarea detaliilor postarii cu id-ul dat
- Se parcurge array-ul de comentarii, se identifica postarea cu id-ul introdus dupa care se afiseaza comentariile, data comentariilor, autorii si numarul de like-uri ale comentariilor conform cerintei

Creare comentariu
- Daca primul parametru intalnit este "-comment-post" se incep verificarile necesare crearii unui comentariu
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura de creare a unui comentariu prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul de id al postarii si de text al comentariului care se doreste a fi adaugat, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Daca acesti parametri exista, se extrag id-ul postarii si textul comentariului prin intermediul metodei scoateInfoDinParametru
- Se verifica daca textul depaseste 300 de caractere, caz in care se afiseaza eroarea corespunzatoare
- Daca nu este intampinata nicio eroare, se poate adauga un nou comentariu. Se creeaza un nou obiect de tip comentariu, i se actualizeaza id-ul de postare
- Se parcurge array-ul de postari pentru identificarea postarii la care se adauga comentariul, i se actualieaza vectorul de comentarii adaugate si numarul acestora
- Se actualieaza continutul comentariului si autorul
- Se actualizeaza array-ul idComentarii si vectorul de comentarii create al utilizatorului curent si numarul acestora
- Se seteaza data comentariului si se adauga comentariul in array-ul comentarii, dupa care se afiseaza mesajul de succes

Sterge comentariu
- Daca primul parametru intalnit este "-delete-comment-by-id" se incep verificarile necesare crearii unui comentariu
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura de stergere a unui comentariu prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul de id al comentariului care se doreste a fi sters, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Daca acest parametru exista, se extrage id-ul comentariului prin intermediul metodei scoateInfoDinParametru
- Se verifica daca id-ul comentariului este valid si daca cel care incearca sa il stearga este autorul acestuia, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se parcurge array-ul de comentarii pentru a se identifica comentariul cu id-ul introdus
- Se elimina comentariul din array-ul comentarii si id-ul lui din array-ul idComentarii
- Se parcurge vectorul de comentarii adaugate ale utilizatorului curent si se elimina comentariul cu id-ul introdus, dupa care se actualieaza numarul de comentarii adaugate ale utilizatorului curent
- Se afiseaza mesajul de succes

Urmaritii utilizatorului curent
- Daca primul parametru intalnit este "-get-following" se incep verificarile necesare afisarii
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura afisare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se parcurge vectorul de urmariti ai utilizatorului curent si se afiseaza conform cerintei

Urmaritorii unui utilizator
- Daca primul parametru intalnit este "-get-followers" se incep verificarile necesare afisarii
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura afisare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInforDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se verifica daca exista parametrul de nume de utilizator al utilizatorului ai carui urmaritori se doresc a fi afisati, iar in caz contrar se afiseaza mesajul de eroare corespunzator
- Daca acest parametru exista, se extrage numele de utilizator prin intermediul metodei scoateInfoDinParametru
- Se verifica daca numele de utilizator este valid, iar in caz contrar se afiseaza mesajul de aroare corespunzator
- Se parcurge vectorul de urmaritori ai utilizatorului dorit si se afiseaza urmaritorii acestuia

Top 5 Postari Apreciate in platforma
- Daca primul parametru intalnit este "-get-most-liked-posts" se incep verificarile necesare afisarii
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura afisare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInfoDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se sorteaza array-ul de postari dupa numarul lor de apreciatori
- Se parcurg primele 5 pozitii ale array-ului (sau postari.size() - 1 in cazul in care nu exista 5 postari) si se afiseaza corespunzator cerintei

Top 5 Postari Comentate in platforma
- Daca primul parametru intalnit este "-get-most-commented-posts" se incep verificarile necesare afisarii
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura afisare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInfoDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se sorteaza array-ul de postari dupa numarul lor de comentarii
- Se parcurg primele 5 pozitii ale array-ului (sau postari.size() - 1 in cazul in care nu exista 5 postari) si se afiseaza corespunzator cerintei

Top 5 Utilizatori Urmariti
- Daca primul parametru intalnit este "-get-most-followed-users" se incep verificarile necesare afisarii
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura afisare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInfoDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se sorteaza array-ul de utilizatori dupa numarul lor de urmaritori
- Se parcurg primele 5 pozitii ale array-ului (sau utilizatori.size() - 1 in cazul in care nu exista 5 utilizatori) si se afiseaza corespunzator cerintei

Top 5 Utilizatori Apreciati in platforma
- Daca primul parametru intalnit este "-get-most-liked-users" se incep verificarile necesare afisarii
- Se verifica daca exista parametrii nume utilizator si parola, iar in caz contrar se afiseaza eroarea corespunzatoare
- In cazul in care sunt prezenti parametrii nume utilizator si parola, se incepe procedura afisare prin separarea numelui de utilizator si a parolei acestuia prin intermediul metodei scoateInfoDinParametru si retinerea lor
- Se verifica daca numele de utilizator si parola introduse sunt corecte prin parcurgerea vectorului utilizatori, iar in caz contrar se afiseaza eroarea corespunzatoare
- Se calculeaza numarul total de aprecieri (cuanteDeAprecieri) pentru fiecare dintre utilizatori, dupa care se sorteaza vectorul de utilizatori in functie de acest camp
- Se afiseaza primii 5 utilizatori cei mai apreciati (sau primii utilizatori.size() - 1 daca nu exista 5 utilizatori) conform cerintei

Curata tot
- Daca primul parametru intalnit este "-cleanup-all" se incepe procedura de curatare
- Se curata array-ul comentarii si se reseteaza id-ul initial al comentariilor
- Se curata array-ul postari si se reseteaza id-ul initial al postarilor
- Se curata array-ul utilizatori
- Se afiseaza mesajul de succes