import Header from './Header.jsx'
import Footer from './Footer.jsx'
import Button from './#7Button.jsx'
import student from './propsStudent.jsx'
import userGreeting from './renderingUserGreet.jsx'
import colorpicker from './#10ColorPicker.jsx'
// import Food from './Food.jsx'//

function App() {
  return (
    <>
    <Header/>
    <Food/>
    <Footer/>
    <Button/>
    <colorpicker/>
   
   {/* including student component within the App component//App is the parent and student is the child component// */}
    <student name="Lnt ki Gotti" age={21} isStudent={fasle}/> {/* setting key value pair to student component this will also transfer to the props */}


    <userGreeting isLoggedIn={true}  username="if true then this will be displayed"/>

    </>

  );
}

export default App ;
