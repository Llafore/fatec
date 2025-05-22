import { useState } from 'react'
import { Footer } from './components/Footer'
import { BrowserRouter } from 'react-router-dom'
import { AppRoutes } from './routes'

function App() {
  const [] = useState(0)

  return (
    <BrowserRouter>
      <AppRoutes />
      <Footer />
    </BrowserRouter>
  )
}

export default App
 