package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data481RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data482RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data483RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data484RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data485RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data486RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data487RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data488RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data489RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data490RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen049ViewModel @Inject constructor(
    private val repo1: Data481RepositoryImpl,
    private val repo2: Data482RepositoryImpl,
    private val repo3: Data483RepositoryImpl,
    private val repo4: Data484RepositoryImpl,
    private val repo5: Data485RepositoryImpl,
    private val repo6: Data486RepositoryImpl,
    private val repo7: Data487RepositoryImpl,
    private val repo8: Data488RepositoryImpl,
    private val repo9: Data489RepositoryImpl,
    private val repo10: Data490RepositoryImpl,

): ViewModel() {
}
