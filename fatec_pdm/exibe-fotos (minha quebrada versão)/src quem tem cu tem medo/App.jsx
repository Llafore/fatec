//rafce
import React from 'react'
import Busca from './components/Busca'
import env from 'react-dotenv'
import { createClient } from 'pexels'

class App extends React.Component{

  pexelsClient = null

  //assim que o componente terminar de ser montado na árvore, construir o objeto com createClient, tal qual visto na documentação
  componentDidMount(){
    this.pexelsClient = createClient(env.PEXELS_KEY)
    console.log(this.pexelsClient)
  }


  onBuscaRealizada = (termo) => {
    console.log(termo)
  }
  render(){
    console.log(env.PEXELS_KEY)
    console.log(window.env.PEXELS_KEY)
    return (
      <div
        className='grid justify-content-center'>
        <div className="col-12">
          <h1>Exibir uma lista de...</h1>
        </div>
        <div className="col-12">
          <Busca 
            dica='Buscar imagens de...' 
            onBuscaRealizada={this.onBuscaRealizada}/>
        </div>
      </div>
    )
  }
}

export default App