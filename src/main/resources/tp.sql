select * from habitants where ville='MONTPELIER' ORDER BY nom asc;
select distinct(nom) from habitants where left(lower(nom),1)='f';
select nom as 'NOM',prenom as 'Prénom' from abonnes where lower(ville)='montpellier' order by nom,prenom;