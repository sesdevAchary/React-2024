function Food(){
    const  Food1 = "Orange";
    const Food2="Banana"

    return(
        <ul>
            <li>Orange</li>
            <li>{Food2}</li> { /*js snippet always under the {} */}
            <li>{Food2().toUpperCase}</li>


        </ul>
    )
}