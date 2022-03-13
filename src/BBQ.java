public class BBQ {
    public static void main(String[] args) {
        Kebab porkKebab = new Kebab(1000, "pork", "Medium well");
        Kebab beefKebab = new Kebab(2000, "beef", "Medium rare");
        Kebab chickenKebab = new Kebab(1500, "chicken", "deep fry");
        System.out.println("У нас есть " + porkKebab.weight + " кг. " + porkKebab.grade + " и эти стейки прожарки степени " + porkKebab.roasting);
        System.out.println("У нас есть " + beefKebab.weight + " кг. " + beefKebab.grade + " и эти стейки прожарки степени " + beefKebab.roasting);
        System.out.println("У нас есть " + chickenKebab.weight + " кг. " + chickenKebab.grade + " и эти стейки прожарки степени " + chickenKebab.roasting);

        int sumMeet = porkKebab.weight + beefKebab.weight + chickenKebab.weight;
        System.out.println("На праздник 9 мая у нас было " + sumMeet + " кг мяса!");
    }
}
// Представим что скоро 9 мая и все едут на шашлыки.
// Задача студента, создать конструктор в которм можно будет создать
// 3 объекта (вида шашлыка). У каждого объекта есть вес, вид мяса и степень прожарки.
// Ну а после нужно вывести на консоль
//У нас есть 1000 кг. pork и эти стейки прожарки степени Medium well
//У нас есть 2000 кг. beef и эти стейки прожарки степени Medium rare
//У нас есть 1500 кг. chicken и эти стейки прожарки степени deep fry
//И вывести сумму всего мяса.