# Urbanowski_Szczepanski_Studnia2D
Studnia2D, paczka falowa
Autorzy:
Krzysztof Urbanowski
Aleksander Szczepański

Program umożliwiający wizualizację stanów stacjonarnych, niestacjonarnych oraz propagacji paczki falowej (opcja dodatkowa) w dwuwymiarowej nieskończonej studni
potencjału.
Interfejs graficzny skład się z 4 części:
- rozwijana lista "Stany", w której skład wchodzą:
    - Stany stacjonarne
    - Stany niestacjonarne
- środkowy panel przedstawiający wizualizacje
- prawy panel, w którego skłąd wchodzą:
    - suwak do zmiany wartości głownej liczby kwantowej dla osi X (nx)
    - suwak do zmiany wartości głownej liczby kwantowej dla osi Y (ny)
- dolny panel, zawierający przyciski, umozliwiający wybór wielu stanów stacjonarnych (nx,ny)
  
  Wizualizacja:
  - kolor fioletowy określa dodatnie wartości Ѱ(x,y,t) (w strone od ekranu)
  - kolor żółty określa dodatnie wartości Ѱ(x,y,t) (w strone do ekranu)

Aby rozpocząć działanie programu należy wybrać jedną z dwóch opcji z rozwijanej listy "Stany".
*  Wybór stanów stacjonarnych, odblokowuje prawy panel oraz blokuje panel dolny. Zmiana wartości nx oraz ny powoduje zmiane wybranego stanu stacjonarnego. Ewolucja tego stanu jest następnie przedstawiona na panelu głownym.
   Zmiany stanów są możliwe podczas trwania wizualizacji.
   
*  Wybór stanów niestacjonarnych , odblokowuje dolny panel i blokuje panel prawy. Wybór kilku stanów stacjonarnych z panelu dolnego powoduje utworzenie stanu niestacjonarego, będącego superpozycją wybranych stanów.
   Ewolucja takiego stanu jest przedstawiona na panelu główynym. Zmiany stanów są możliwe podczas trwania wizualizacji.
   Opcja stany niestacjonarne umożliwia również wizualizacje paczki falowej. Aby taką wizualizacje uruchomić należy nacisnąć w dowlony punkt znajdujący się na panelu głównym.
   Od tego punktu paczka falowa zaczyna swoją propagacje. Aby przerwać propagacje paczki falowej należy wybrać jedną z opcji "Stany" lub uruchomić kolejną wizualizacje naciskając na dowlny punkt panelu głównego. 
  
